package com.google.gson.internal.bind;

/* loaded from: classes16.dex */
public final class DateTypeAdapter extends com.google.gson.v {

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.gson.w f44716b = new com.google.gson.w() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.w
        public com.google.gson.v a(com.google.gson.i iVar, ib.a aVar) {
            if (aVar.f290021a == java.util.Date.class) {
                return new com.google.gson.internal.bind.DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f44717a;

    public DateTypeAdapter() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f44717a = arrayList;
        java.util.Locale locale = java.util.Locale.US;
        arrayList.add(java.text.DateFormat.getDateTimeInstance(2, 2, locale));
        if (!java.util.Locale.getDefault().equals(locale)) {
            arrayList.add(java.text.DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.google.gson.internal.s.f44823a >= 9) {
            arrayList.add(com.google.gson.internal.e0.a(2, 2));
        }
    }

    @Override // com.google.gson.v
    public java.lang.Object b(jb.b bVar) {
        if (bVar.K() == jb.c.NULL) {
            bVar.D();
            return null;
        }
        java.lang.String I = bVar.I();
        synchronized (this) {
            java.util.Iterator it = ((java.util.ArrayList) this.f44717a).iterator();
            while (it.hasNext()) {
                try {
                    return ((java.text.DateFormat) it.next()).parse(I);
                } catch (java.text.ParseException unused) {
                }
            }
            try {
                return gb.a.b(I, new java.text.ParsePosition(0));
            } catch (java.text.ParseException e17) {
                throw new com.google.gson.r(I, e17);
            }
        }
    }

    @Override // com.google.gson.v
    public void c(jb.d dVar, java.lang.Object obj) {
        java.util.Date date = (java.util.Date) obj;
        synchronized (this) {
            if (date == null) {
                dVar.p();
            } else {
                dVar.A(((java.text.DateFormat) ((java.util.ArrayList) this.f44717a).get(0)).format(date));
            }
        }
    }
}
