package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class h2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i2 f200040d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i2 i2Var) {
        super(2);
        this.f200040d = i2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((cp0.n) obj, "<anonymous parameter 0>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLivePostCoverWidget", "setCover: onTaskEnd, resource:" + bitmap);
        if (bitmap != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i2 i2Var = this.f200040d;
            c19788xd7cfd73e.m76678xca029dad(i2Var.f200155m);
            c19788xd7cfd73e.m76666xdb5612fc(9);
            c19788xd7cfd73e.m76676xd3f7e23b(i2Var.f200155m);
            c19788xd7cfd73e.m76682xc9923ded(0);
            c19788xd7cfd73e.m76685x53e9ee84(bitmap.getWidth());
            c19788xd7cfd73e.m76658xf84e829(bitmap.getHeight());
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(byteArrayOutputStream.toByteArray());
                if (b17 == null) {
                    b17 = "";
                }
                c19788xd7cfd73e.m76665x17e7970f(b17);
            } catch (java.lang.Throwable unused) {
                c19788xd7cfd73e.m76665x17e7970f("");
            }
            c19788xd7cfd73e.m76638x619ae8ba(i2Var.f200155m);
            i2Var.f200156n = c19788xd7cfd73e;
        }
        return jz5.f0.f384359a;
    }
}
