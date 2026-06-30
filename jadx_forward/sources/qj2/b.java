package qj2;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj2.d f445401d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qj2.d dVar) {
        super(0);
        this.f445401d = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qj2.d dVar = this.f445401d;
        int childCount = dVar.m174020xdedd954c().getChildCount();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = dVar.m174020xdedd954c().getChildAt(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
            if (childAt.getVisibility() == 0) {
                i17++;
            }
        }
        if (i17 < 3) {
            dVar.m174037x875dffd2(1.0f);
        } else {
            dVar.m174037x875dffd2(0.6f);
        }
        return jz5.f0.f384359a;
    }
}
