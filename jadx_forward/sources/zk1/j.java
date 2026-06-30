package zk1;

/* loaded from: classes7.dex */
public final class j {
    public j(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static /* synthetic */ void b(zk1.j jVar, android.view.View view, java.lang.Class cls, java.lang.Integer num, boolean z17, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Integer num2, yz5.a aVar, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5, java.lang.Integer num6, java.lang.Integer num7, int i17, java.lang.Object obj) {
        jVar.a(view, (i17 & 2) != 0 ? null : cls, (i17 & 4) != 0 ? null : num, (i17 & 8) != 0 ? false : z17, (i17 & 16) != 0 ? null : bool, (i17 & 32) != 0 ? null : bool2, (i17 & 64) != 0 ? null : num2, (i17 & 128) != 0 ? null : aVar, (i17 & 256) != 0 ? null : num3, (i17 & 512) != 0 ? null : num4, (i17 & 1024) != 0 ? null : num5, (i17 & 2048) != 0 ? null : num6, (i17 & 4096) == 0 ? num7 : null);
    }

    public final void a(android.view.View view, java.lang.Class cls, java.lang.Integer num, boolean z17, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Integer num2, yz5.a aVar, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5, java.lang.Integer num6, java.lang.Integer num7) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.graphics.Rect rect = null;
        java.lang.String string = num != null ? view.getContext().getString(num.intValue()) : null;
        java.lang.String string2 = num2 != null ? view.getContext().getString(num2.intValue()) : null;
        int e17 = num7 != null ? com.p314xaae8f345.mm.ui.zk.e(view.getContext(), num7.intValue()) : 0;
        int a17 = num3 != null ? com.p314xaae8f345.mm.ui.zk.a(view.getContext(), num3.intValue()) : e17;
        int a18 = num4 != null ? com.p314xaae8f345.mm.ui.zk.a(view.getContext(), num4.intValue()) : e17;
        int a19 = num5 != null ? com.p314xaae8f345.mm.ui.zk.a(view.getContext(), num5.intValue()) : e17;
        if (num6 != null) {
            e17 = com.p314xaae8f345.mm.ui.zk.a(view.getContext(), num6.intValue());
        }
        int i17 = e17;
        if (a17 != 0 || a18 != 0 || a19 != 0 || i17 != 0) {
            view.post(new zk1.h(view, a17, a19, a18, i17));
            rect = new android.graphics.Rect(a17, a19, a18, i17);
        }
        view.setAccessibilityDelegate(new zk1.m(view, cls, string, z17, bool, bool2, string2, aVar, rect, null));
    }
}
