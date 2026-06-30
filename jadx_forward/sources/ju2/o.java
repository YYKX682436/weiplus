package ju2;

/* loaded from: classes10.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f383360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 f383361e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 c15003x1d0c0ec1) {
        super(0);
        this.f383360d = context;
        this.f383361e = c15003x1d0c0ec1;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int m60862x97cbed21;
        int m60862x97cbed212;
        android.content.Context context = this.f383360d;
        android.content.res.Resources resources = context.getResources();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 c15003x1d0c0ec1 = this.f383361e;
        m60862x97cbed21 = c15003x1d0c0ec1.m60862x97cbed21();
        m60862x97cbed212 = c15003x1d0c0ec1.m60862x97cbed21();
        c22699x3dcdb352.setLayoutParams(new android.widget.FrameLayout.LayoutParams(m60862x97cbed21, m60862x97cbed212));
        c22699x3dcdb352.m82040x7541828(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80122x3525c293);
        return c22699x3dcdb352;
    }
}
