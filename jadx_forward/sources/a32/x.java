package a32;

/* loaded from: classes10.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 f82581d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 c13394xa8c361b5) {
        super(2);
        this.f82581d = c13394xa8c361b5;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.view.Window window;
        android.view.Window window2;
        int intValue = ((java.lang.Number) obj).intValue();
        t85.d info = (t85.d) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 c13394xa8c361b5 = this.f82581d;
        if (intValue >= 0 && intValue < c13394xa8c361b5.f180202g.mo1894x7e414b06()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(info.f497989a, u22.r.f505541r)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141 c13384x547d8141 = c13394xa8c361b5.reporter;
                if (c13384x547d8141 != null) {
                    c13384x547d8141.e(25);
                }
                if (c13394xa8c361b5.f180210r == null) {
                    c13394xa8c361b5.f180206n.b();
                    c13394xa8c361b5.f180210r = new y9.i(c13394xa8c361b5.getContext(), 0);
                    android.content.Context context = c13394xa8c361b5.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd c13395xf82efecd = new com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd(context, null);
                    c13394xa8c361b5.f180209q = c13395xf82efecd;
                    c13395xf82efecd.m54925x5d1e8363(c13394xa8c361b5.reporter);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd c13395xf82efecd2 = c13394xa8c361b5.f180209q;
                    if (c13395xf82efecd2 != null) {
                        c13395xf82efecd2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f77973xd16c52d4);
                    }
                    float dimension = c13394xa8c361b5.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561885vd) + c13394xa8c361b5.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a7u) + c13394xa8c361b5.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561887vf);
                    android.view.ViewParent parent = c13394xa8c361b5.getParent();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, ((android.view.ViewGroup) parent).getHeight() - ((int) dimension));
                    y9.i iVar = c13394xa8c361b5.f180210r;
                    if (iVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd c13395xf82efecd3 = c13394xa8c361b5.f180209q;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c13395xf82efecd3);
                        iVar.setContentView(c13395xf82efecd3, marginLayoutParams);
                    }
                    y9.i iVar2 = c13394xa8c361b5.f180210r;
                    if (iVar2 != null && (window2 = iVar2.getWindow()) != null) {
                        window2.clearFlags(2);
                    }
                    y9.i iVar3 = c13394xa8c361b5.f180210r;
                    if (iVar3 != null && (window = iVar3.getWindow()) != null) {
                        window.addFlags(1024);
                    }
                    y9.i iVar4 = c13394xa8c361b5.f180210r;
                    if (iVar4 != null) {
                        iVar4.setOnDismissListener(new a32.g0(c13394xa8c361b5));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd c13395xf82efecd4 = c13394xa8c361b5.f180209q;
                    u22.c dataCallback = c13395xf82efecd4 != null ? c13395xf82efecd4.getDataCallback() : null;
                    u22.a aVar = c13394xa8c361b5.f180208p;
                    aVar.f505505a = dataCallback;
                    if (dataCallback != null) {
                        dataCallback.b(aVar.f505506b);
                    }
                    if (dataCallback != null) {
                        dataCallback.c(0, aVar.f505506b.size());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd c13395xf82efecd5 = c13394xa8c361b5.f180209q;
                    if (c13395xf82efecd5 != null) {
                        c13395xf82efecd5.m54926xd4853daf(new a32.h0(c13394xa8c361b5));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd c13395xf82efecd6 = c13394xa8c361b5.f180209q;
                    if (c13395xf82efecd6 != null) {
                        c13395xf82efecd6.m54923x90910d1b(new a32.i0(c13394xa8c361b5));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd c13395xf82efecd7 = c13394xa8c361b5.f180209q;
                    if (c13395xf82efecd7 != null) {
                        c13395xf82efecd7.m54924x4c9c8742(new a32.j0(c13394xa8c361b5));
                    }
                }
                y9.i iVar5 = c13394xa8c361b5.f180210r;
                if (iVar5 != null) {
                    iVar5.show();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd c13395xf82efecd8 = c13394xa8c361b5.f180209q;
                if (c13395xf82efecd8 != null) {
                    c13395xf82efecd8.A();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd c13395xf82efecd9 = c13394xa8c361b5.f180209q;
                if (c13395xf82efecd9 != null) {
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c13395xf82efecd9.B, c13394xa8c361b5.f180212t)) {
                        z22.f fVar = c13395xf82efecd9.f180218y;
                        int i17 = fVar.f551251e;
                        if (i17 != -1) {
                            fVar.m8147xed6e4d18(i17);
                            fVar.f551251e = -1;
                            fVar.m8147xed6e4d18(-1);
                        }
                        yz5.l lVar = c13395xf82efecd9.selectionCallback;
                        if (lVar != null) {
                            lVar.mo146xb9724478(null);
                        }
                    }
                }
            } else {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c13394xa8c361b5.f180201f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$2", "invoke", "(ILcom/tencent/mm/sticker/LensItem;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                c1163xf1deaba4.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$2", "invoke", "(ILcom/tencent/mm/sticker/LensItem;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        }
        return jz5.f0.f384359a;
    }
}
