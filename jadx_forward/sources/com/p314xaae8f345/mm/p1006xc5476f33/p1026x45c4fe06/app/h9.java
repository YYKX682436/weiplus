package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.class})
/* loaded from: classes7.dex */
public final class h9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l8 {
    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t8(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l8, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5
    public void Eh(java.lang.String str, r.a aVar) {
        uk0.a.b(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d9.f156589d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.e9(aVar));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l8, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5
    public void Ug(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.q5 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (str2 == null || str == null) {
            return;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        obtain.writeString(str);
        obtain.writeString(str2);
        obtain.setDataPosition(0);
        try {
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l8, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5
    public km5.q g2(java.lang.String str) {
        pq5.g a17 = pq5.h.a();
        a17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g9(str));
        return a17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l8, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5
    public void oh(int i17, java.lang.String str, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar;
        android.util.SparseArray sparseArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.a.f165403a;
        synchronized (sparseArray) {
            oVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o) sparseArray.get(i17);
        }
        if (oVar != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            of1.w1 w1Var = (of1.w1) oVar;
            jSONObject.put("htmlId", w1Var.m151224xd4bfd001());
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str);
            jSONObject.put("arg", obj);
            w1Var.F(jSONObject);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l8, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5
    public void p7(java.util.List list) {
        if (list == null) {
            return;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        obtain.writeStringList(list);
        obtain.setDataPosition(0);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, obtain, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.s8.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.b9(obtain));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l8, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5
    public void sd(java.lang.String str, java.lang.String str2, int i17) {
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168.C12141x9d1ae043 c12141x9d1ae043 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168.C12141x9d1ae043();
        c12141x9d1ae043.f162804d = str;
        c12141x9d1ae043.f162805e = str2;
        c12141x9d1ae043.f162806f = i17;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str3, c12141x9d1ae043, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.a9.class, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l8, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5
    public void xh(java.lang.String str) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.y8.class, null);
    }
}
