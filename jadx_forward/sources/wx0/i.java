package wx0;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f532030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.ViewGroup viewGroup) {
        super(0);
        this.f532030d = viewGroup;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup viewGroup = this.f532030d;
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10978x483f26e5 c10978x483f26e5 = new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10978x483f26e5(context, null, 0, 6, null);
        c10978x483f26e5.setId(android.view.View.generateViewId());
        c10978x483f26e5.setLayoutParams(new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, -1));
        c10978x483f26e5.setVisibility(8);
        viewGroup.addView(c10978x483f26e5);
        return c10978x483f26e5;
    }
}
