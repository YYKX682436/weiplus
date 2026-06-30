package ur1;

/* loaded from: classes2.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f511899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(yz5.l lVar) {
        super(1);
        this.f511899d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String data = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPersonalDraftFeatureService", "readDraft from newImageEditor contentLen: " + data.length() + ", contentMd5: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(data.getBytes()) + ", contentPrefix: " + r26.p0.E0(data, 200));
        this.f511899d.mo146xb9724478(data);
        return jz5.f0.f384359a;
    }
}
