package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class o extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1.w f10670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.AndroidComposeView f10671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.AndroidComposeView f10672g;

    public o(u1.w wVar, androidx.compose.ui.platform.AndroidComposeView androidComposeView, androidx.compose.ui.platform.AndroidComposeView androidComposeView2) {
        this.f10670e = wVar;
        this.f10671f = androidComposeView;
        this.f10672g = androidComposeView2;
    }

    @Override // n3.c
    public void onInitializeAccessibilityNodeInfo(android.view.View host, o3.l info) {
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        y1.n d17 = y1.z.d(this.f10670e);
        kotlin.jvm.internal.o.d(d17);
        d17.c();
        int i17 = ((y1.q) ((y1.o) d17.f423655e)).f458786d;
        u1.w p17 = d17.f423654d.f423554h.p();
        while (true) {
            if (p17 == null) {
                p17 = null;
                break;
            } else {
                if (java.lang.Boolean.valueOf(y1.z.d(p17) != null).booleanValue()) {
                    break;
                } else {
                    p17 = p17.p();
                }
            }
        }
        y1.n d18 = p17 != null ? y1.z.d(p17) : null;
        y1.y yVar = d18 != null ? new y1.y(d18, false) : null;
        kotlin.jvm.internal.o.d(yVar);
        int i18 = this.f10671f.getSemanticsOwner().a().f458800f;
        int i19 = yVar.f458800f;
        if (i19 == i18) {
            i19 = -1;
        }
        info.f342643b = i19;
        info.f342642a.setParent(this.f10672g, i19);
    }
}
