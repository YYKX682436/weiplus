package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d;

/* renamed from: com.google.gson.internal.bind.DateTypeAdapter */
/* loaded from: classes16.dex */
public final class C2763xd9f46e07 extends com.p176xb6135e39.p280x308fcb.v {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126249b = new com.p176xb6135e39.p280x308fcb.w() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.p176xb6135e39.p280x308fcb.w
        public com.p176xb6135e39.p280x308fcb.v a(com.p176xb6135e39.p280x308fcb.i iVar, ib.a aVar) {
            if (aVar.f371554a == java.util.Date.class) {
                return new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2763xd9f46e07();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f126250a;

    public C2763xd9f46e07() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f126250a = arrayList;
        java.util.Locale locale = java.util.Locale.US;
        arrayList.add(java.text.DateFormat.getDateTimeInstance(2, 2, locale));
        if (!java.util.Locale.getDefault().equals(locale)) {
            arrayList.add(java.text.DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.s.f126356a >= 9) {
            arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e0.a(2, 2));
        }
    }

    @Override // com.p176xb6135e39.p280x308fcb.v
    public java.lang.Object b(jb.b bVar) {
        if (bVar.K() == jb.c.NULL) {
            bVar.D();
            return null;
        }
        java.lang.String I = bVar.I();
        synchronized (this) {
            java.util.Iterator it = ((java.util.ArrayList) this.f126250a).iterator();
            while (it.hasNext()) {
                try {
                    return ((java.text.DateFormat) it.next()).parse(I);
                } catch (java.text.ParseException unused) {
                }
            }
            try {
                return gb.a.b(I, new java.text.ParsePosition(0));
            } catch (java.text.ParseException e17) {
                throw new com.p176xb6135e39.p280x308fcb.r(I, e17);
            }
        }
    }

    @Override // com.p176xb6135e39.p280x308fcb.v
    public void c(jb.d dVar, java.lang.Object obj) {
        java.util.Date date = (java.util.Date) obj;
        synchronized (this) {
            if (date == null) {
                dVar.p();
            } else {
                dVar.A(((java.text.DateFormat) ((java.util.ArrayList) this.f126250a).get(0)).format(date));
            }
        }
    }
}
