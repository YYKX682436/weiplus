package et0;

/* loaded from: classes14.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10906xaf641c58 f338091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f338092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f338093f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10906xaf641c58 c10906xaf641c58, int i17, int i18) {
        super(0);
        this.f338091d = c10906xaf641c58;
        this.f338092e = i17;
        this.f338093f = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f338092e;
        com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10906xaf641c58 c10906xaf641c58 = this.f338091d;
        c10906xaf641c58.f150477o = i17;
        c10906xaf641c58.f150478p = this.f338093f;
        ms0.c renderer = c10906xaf641c58.getRenderer();
        if (renderer != null) {
            renderer.t(c10906xaf641c58.f150477o, c10906xaf641c58.f150478p);
        }
        return jz5.f0.f384359a;
    }
}
