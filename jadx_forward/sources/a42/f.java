package a42;

/* loaded from: classes4.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f82736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f82738f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.widget.TextView textView, int i17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        super(0);
        this.f82736d = textView;
        this.f82737e = i17;
        this.f82738f = c22699x3dcdb352;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f82737e;
        android.widget.TextView textView = this.f82736d;
        if (textView != null) {
            textView.setTextColor(i17);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f82738f;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(i17);
        }
        return jz5.f0.f384359a;
    }
}
