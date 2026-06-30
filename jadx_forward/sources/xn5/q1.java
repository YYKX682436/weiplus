package xn5;

/* loaded from: classes13.dex */
public final class q1 implements xn5.d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final xn5.q1 f537246a = new xn5.q1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f537247b = kz5.c1.l(new jz5.l("com.tencent.mm.view.x2c.X2CView", new xn5.c0("com.tencent.mm.view.x2c.X2CView", null, 20, null, 10, null)), new jz5.l("com.tencent.mm.view.x2c.X2CTextView", new xn5.c0("com.tencent.mm.view.x2c.X2CTextView", null, 80, null, 10, null)), new jz5.l("com.tencent.mm.view.x2c.X2CImageView", new xn5.c0("com.tencent.mm.view.x2c.X2CImageView", null, 40, null, 10, null)), new jz5.l("com.tencent.mm.view.x2c.X2CButton", new xn5.c0("com.tencent.mm.view.x2c.X2CButton", null, 0, null, 14, null)), new jz5.l("com.tencent.mm.view.x2c.X2CImageButton", new xn5.c0("com.tencent.mm.view.x2c.X2CImageButton", null, 0, null, 14, null)), new jz5.l("com.tencent.mm.view.x2c.X2CLinearLayout", new xn5.c0("com.tencent.mm.view.x2c.X2CLinearLayout", null, 0, null, 14, null)), new jz5.l("com.tencent.mm.view.x2c.X2CRelativeLayout", new xn5.c0("com.tencent.mm.view.x2c.X2CRelativeLayout", null, 0, null, 14, null)), new jz5.l("com.tencent.mm.view.x2c.X2CFrameLayout", new xn5.c0("com.tencent.mm.view.x2c.X2CFrameLayout", null, 0, null, 14, null)), new jz5.l("com.tencent.mm.view.x2c.X2CCheckBox", new xn5.c0("com.tencent.mm.view.x2c.X2CCheckBox", null, 0, null, 14, null)), new jz5.l("com.tencent.mm.view.x2c.X2CListView", new xn5.c0("com.tencent.mm.view.x2c.X2CListView", null, 5, null, 10, null)), new jz5.l("com.tencent.mm.ui.widget.imageview.WeImageButton", new xn5.c0("com.tencent.mm.ui.widget.imageview.WeImageButton", null, 0, null, 14, null)), new jz5.l("com.tencent.mm.ui.widget.imageview.WeImageView", new xn5.c0("com.tencent.mm.ui.widget.imageview.WeImageView", null, 0, null, 14, null)), new jz5.l("com.tencent.mm.ui.base.NoMeasuredTextView", new xn5.c0("com.tencent.mm.ui.base.NoMeasuredTextView", null, 0, null, 14, null)), new jz5.l("com.tencent.mm.ui.conversation.ConversationFolderItemView", new xn5.c0("com.tencent.mm.ui.conversation.ConversationFolderItemView", null, 0, null, 14, null)), new jz5.l("com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl", new xn5.c0("com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl", null, 10, null, 10, null)), new jz5.l("com.tencent.mm.kiss.widget.textview.PLSysTextView", new xn5.c0("com.tencent.mm.kiss.widget.textview.PLSysTextView", null, 0, null, 14, null)), new jz5.l("com.tencent.mm.plugin.sns.ui.SnsTranslateResultView", new xn5.c0("com.tencent.mm.plugin.sns.ui.SnsTranslateResultView", null, 5, null, 10, null)), new jz5.l("com.tencent.mm.plugin.sns.ui.AsyncTextView", new xn5.c0("com.tencent.mm.plugin.sns.ui.AsyncTextView", null, 5, null, 10, null)));

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.reflect.Field f537248c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f537249d;

    public static final void a(xn5.q1 q1Var, xn5.c0 c0Var) {
        q1Var.getClass();
        int size = c0Var.f537188b.size();
        int i17 = c0Var.f537189c;
        if (size < i17) {
            int i18 = i17 - size;
            for (int i19 = 0; i19 < i18; i19++) {
                try {
                    android.view.View view = (android.view.View) c0Var.f537190d.mo146xb9724478(c0Var);
                    if (view != null) {
                        java.util.List list = c0Var.f537188b;
                        view.setTag(com.p314xaae8f345.mm.R.id.psb, 1);
                        list.add(view);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.X2C.X2CViewCreator", e17, "fillingCacheView: " + c0Var.f537187a, new java.lang.Object[0]);
                    return;
                }
            }
        }
    }

    public final void b() {
        if (f537249d) {
            return;
        }
        f537249d = true;
        pm0.v.N("X2C_VIEW_THREAD", false, xn5.l1.f537226d);
    }

    public android.view.View c(android.content.Context context, java.lang.String name) {
        java.lang.reflect.Field field;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        xn5.c0 c0Var = (xn5.c0) ((java.util.LinkedHashMap) f537247b).get(name);
        android.view.View view = null;
        if (c0Var != null && (field = f537248c) != null) {
            java.util.List list = c0Var.f537188b;
            boolean z17 = !list.isEmpty();
            xn5.q1 q1Var = f537246a;
            if (z17) {
                view = (android.view.View) fp.l.a(list);
                field.set(view, context);
                if (list.size() < c0Var.f537189c / 2) {
                    q1Var.b();
                }
            } else {
                q1Var.b();
            }
        }
        return view;
    }
}
