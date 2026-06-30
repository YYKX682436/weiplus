package hf2;

/* loaded from: classes10.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.h0 f362560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f362561e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(hf2.h0 h0Var, int i17) {
        super(1);
        this.f362560d = h0Var;
        this.f362561e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        r45.ji0 ji0Var;
        java.util.LinkedList linkedList2;
        r45.ji0 ji0Var2;
        java.util.LinkedList linkedList3;
        java.util.LinkedList linkedList4;
        qc0.j2 status = (qc0.j2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        hf2.h0 h0Var = this.f362560d;
        java.lang.String str = h0Var.f362604b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("StickerItemBehaviorStatus: ");
        sb6.append(status);
        sb6.append(",stickerType:");
        int i17 = this.f362561e;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(status, qc0.g2.f442917c);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hf2.x xVar = h0Var.f362603a;
        if (!b17) {
            ((hf2.f1) ((jz5.n) xVar.B).mo141623x754a37bb()).a(i17, status);
            return f0Var;
        }
        android.graphics.Bitmap bitmap = status.f442923a;
        if (bitmap != null) {
            bitmap.getByteCount();
        }
        android.graphics.Bitmap bitmap2 = status.f442923a;
        if (bitmap2 != null) {
            bitmap2.getWidth();
        }
        android.graphics.Bitmap bitmap3 = status.f442923a;
        if (bitmap3 != null) {
            bitmap3.getHeight();
        }
        r45.ei0 ei0Var = status.f442924b;
        if (ei0Var != null && (linkedList4 = ei0Var.f455062d) != null) {
            linkedList4.size();
        }
        r45.ei0 ei0Var2 = status.f442924b;
        if (ei0Var2 != null && (linkedList3 = ei0Var2.f455062d) != null) {
        }
        xVar.t7("TEXT_FINISH_EDITING_SUCCESS_RESULT", status.f442924b);
        android.view.View view = h0Var.f362606d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerEditorWidget$launchStickerEditorContainer$5", "invoke", "(Lcom/tencent/mm/feature/recordvideo/api/StickerEditorItemBehaviorStatus;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerEditorWidget$launchStickerEditorContainer$5", "invoke", "(Lcom/tencent/mm/feature/recordvideo/api/StickerEditorItemBehaviorStatus;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        hf2.l2 l76 = xVar.l7();
        r45.ei0 ei0Var3 = xVar.f362718q;
        java.lang.String str2 = (ei0Var3 == null || (linkedList2 = ei0Var3.f455062d) == null || (ji0Var2 = (r45.ji0) kz5.n0.Z(linkedList2)) == null) ? null : ji0Var2.f459362n;
        l76.b("TEXT_FINISH_EDITING_SUCCESS_RESULT", !(str2 == null || str2.length() == 0));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(h0Var.f362603a, null, null, new hf2.b0(h0Var, null), 3, null);
        android.graphics.Bitmap bitmap4 = status.f442923a;
        if (bitmap4 == null) {
            return null;
        }
        hf2.b2 h76 = xVar.h7();
        r45.ei0 ei0Var4 = status.f442924b;
        h76.d("editor_confirm", bitmap4, (ei0Var4 == null || (linkedList = ei0Var4.f455062d) == null || (ji0Var = (r45.ji0) kz5.n0.Z(linkedList)) == null) ? 1.0f : ji0Var.f459360i);
        return f0Var;
    }
}
