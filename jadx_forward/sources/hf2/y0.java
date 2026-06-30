package hf2;

/* loaded from: classes5.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final hf2.x f362733a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f362734b;

    /* renamed from: c, reason: collision with root package name */
    public final int f362735c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f362736d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f362737e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.EditText f362738f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f362739g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f362740h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f362741i;

    /* renamed from: j, reason: collision with root package name */
    public hf2.l0 f362742j;

    /* renamed from: k, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f362743k;

    public y0(hf2.x controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f362733a = controller;
        this.f362734b = controller.f362714m + "_Maas";
        this.f362735c = 8;
    }

    public static java.lang.Object b(hf2.y0 y0Var, r45.h84 h84Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        java.util.LinkedList linkedList;
        r45.ji0 ji0Var;
        if ((i17 & 2) != 0) {
            r45.ei0 ei0Var = y0Var.f362733a.f362718q;
            str = (ei0Var == null || (linkedList = ei0Var.f455062d) == null || (ji0Var = (r45.ji0) kz5.n0.Z(linkedList)) == null) ? null : ji0Var.f459362n;
            if (str == null) {
                str = "";
            }
        }
        return y0Var.a(h84Var, str, interfaceC29045xdcb5ca57);
    }

    public static final void e(android.widget.EditText editText, hf2.y0 y0Var) {
        android.text.Editable text;
        if (((editText == null || (text = editText.getText()) == null) ? 0 : text.length()) <= 0) {
            android.view.View view = y0Var.f362739g;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerMaasWidget", "showCustomTextEditorInput$checkDeleteBtnVisibility", "(Landroid/widget/EditText;Lcom/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerMaasWidget;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerMaasWidget", "showCustomTextEditorInput$checkDeleteBtnVisibility", "(Landroid/widget/EditText;Lcom/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerMaasWidget;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = y0Var.f362739g;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerMaasWidget", "showCustomTextEditorInput$checkDeleteBtnVisibility", "(Landroid/widget/EditText;Lcom/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerMaasWidget;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerMaasWidget", "showCustomTextEditorInput$checkDeleteBtnVisibility", "(Landroid/widget/EditText;Lcom/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerMaasWidget;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x035b A[Catch: Exception -> 0x0365, TRY_LEAVE, TryCatch #3 {Exception -> 0x0365, blocks: (B:115:0x0357, B:117:0x035b), top: B:114:0x0357 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad A[LOOP:1: B:63:0x015e->B:72:0x01ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ba A[EDGE_INSN: B:73:0x01ba->B:74:0x01ba BREAK  A[LOOP:1: B:63:0x015e->B:72:0x01ad], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02aa A[LOOP:0: B:51:0x0122->B:94:0x02aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(r45.h84 r28, java.lang.String r29, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r30) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.y0.a(r45.h84, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(android.widget.EditText editText) {
        android.content.Context context;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((editText == null || (context = editText.getContext()) == null) ? null : context.getSystemService("input_method"));
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText != null ? editText.getWindowToken() : null, 0);
        }
        android.view.View view = this.f362737e;
        if (view != null) {
            zl2.r4.f555483a.Q2(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.y0.d(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
