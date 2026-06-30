package com.google.gson.internal.bind;

/* loaded from: classes16.dex */
public final class SqlDateTypeAdapter extends com.google.gson.v {

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.gson.w f44734b = new com.google.gson.w() { // from class: com.google.gson.internal.bind.SqlDateTypeAdapter.1
        @Override // com.google.gson.w
        public com.google.gson.v a(com.google.gson.i iVar, ib.a aVar) {
            if (aVar.f290021a == java.sql.Date.class) {
                return new com.google.gson.internal.bind.SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final java.text.DateFormat f44735a = new java.text.SimpleDateFormat("MMM d, yyyy");

    @Override // com.google.gson.v
    public java.lang.Object b(jb.b bVar) {
        synchronized (this) {
            if (bVar.K() == jb.c.NULL) {
                bVar.D();
                return null;
            }
            try {
                return new java.sql.Date(this.f44735a.parse(bVar.I()).getTime());
            } catch (java.text.ParseException e17) {
                throw new com.google.gson.r(e17);
            }
        }
    }

    @Override // com.google.gson.v
    public void c(jb.d dVar, java.lang.Object obj) {
        java.sql.Date date = (java.sql.Date) obj;
        synchronized (this) {
            dVar.A(date == null ? null : this.f44735a.format((java.util.Date) date));
        }
    }
}
