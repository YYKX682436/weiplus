package v70;

/* loaded from: classes5.dex */
public final class o implements ea0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f515147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v70.w f515148b;

    public o(int i17, v70.w wVar) {
        this.f515147a = i17;
        this.f515148b = wVar;
    }

    @Override // ea0.e
    public final void a(java.lang.String phash, java.lang.String pdqHash) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phash, "phash");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pdqHash, "pdqHash");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("computePHash putPHash key:");
        int i17 = this.f515147a;
        sb6.append(i17);
        sb6.append(" phash:");
        sb6.append(phash);
        sb6.append(" pdqHash:");
        sb6.append(pdqHash);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.MsgImgFeatureService", sb6.toString());
        ((java.util.HashMap) ((jz5.n) this.f515148b.f515163r).mo141623x754a37bb()).put(java.lang.Integer.valueOf(i17), new jz5.l(phash, pdqHash));
    }
}
