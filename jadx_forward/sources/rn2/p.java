package rn2;

/* loaded from: classes15.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.w f479345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f479346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f479347f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f479348g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(rn2.w wVar, android.view.View view, android.view.View view2, java.util.List list) {
        super(0);
        this.f479345d = wVar;
        this.f479346e = view;
        this.f479347f = view2;
        this.f479348g = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rn2.w wVar = this.f479345d;
        android.view.View doneBtn = this.f479346e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(doneBtn, "$doneBtn");
        android.view.View view = this.f479347f;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.q5g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.q5n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.ohp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        rn2.w.a(wVar, doneBtn, (android.widget.TextView) findViewById, findViewById2, (android.widget.TextView) findViewById3, this.f479348g);
        return jz5.f0.f384359a;
    }
}
