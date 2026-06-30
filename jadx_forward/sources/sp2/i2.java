package sp2;

/* loaded from: classes2.dex */
public final class i2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492583d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(sp2.o2 o2Var) {
        super(0);
        this.f492583d = o2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sp2.o2 o2Var = this.f492583d;
        up2.m mVar = o2Var.f492693v;
        if (mVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e034 = o2Var.f492672j;
            if (c14595xffb7e034 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            mVar.e("transResponseToListData", c14595xffb7e034);
        }
        return jz5.f0.f384359a;
    }
}
