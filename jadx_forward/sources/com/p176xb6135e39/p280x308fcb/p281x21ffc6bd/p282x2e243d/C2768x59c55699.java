package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d;

/* renamed from: com.google.gson.internal.bind.SqlDateTypeAdapter */
/* loaded from: classes16.dex */
public final class C2768x59c55699 extends com.p176xb6135e39.p280x308fcb.v {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126267b = new com.p176xb6135e39.p280x308fcb.w() { // from class: com.google.gson.internal.bind.SqlDateTypeAdapter.1
        @Override // com.p176xb6135e39.p280x308fcb.w
        public com.p176xb6135e39.p280x308fcb.v a(com.p176xb6135e39.p280x308fcb.i iVar, ib.a aVar) {
            if (aVar.f371554a == java.sql.Date.class) {
                return new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2768x59c55699();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final java.text.DateFormat f126268a = new java.text.SimpleDateFormat("MMM d, yyyy");

    @Override // com.p176xb6135e39.p280x308fcb.v
    public java.lang.Object b(jb.b bVar) {
        synchronized (this) {
            if (bVar.K() == jb.c.NULL) {
                bVar.D();
                return null;
            }
            try {
                return new java.sql.Date(this.f126268a.parse(bVar.I()).getTime());
            } catch (java.text.ParseException e17) {
                throw new com.p176xb6135e39.p280x308fcb.r(e17);
            }
        }
    }

    @Override // com.p176xb6135e39.p280x308fcb.v
    public void c(jb.d dVar, java.lang.Object obj) {
        java.sql.Date date = (java.sql.Date) obj;
        synchronized (this) {
            dVar.A(date == null ? null : this.f126268a.format((java.util.Date) date));
        }
    }
}
