package hg2;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hg2.h f362874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(hg2.h hVar) {
        super(0);
        this.f362874d = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hg2.h hVar = this.f362874d;
        int i17 = hVar.f362888p;
        if (i17 > 0) {
            boolean z17 = i17 >= 3600;
            android.widget.TextView textView = hVar.f362890r;
            if (textView != null) {
                textView.setText(no0.l.a(no0.m.f420263a, i17, ":", z17, false, false, 24, null));
            }
            hVar.f362888p--;
        } else {
            hVar.f362889q.d();
            android.view.ViewGroup viewGroup = hVar.f362886n;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }
        return jz5.f0.f384359a;
    }
}
