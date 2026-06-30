package jg5;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final jg5.c f381198a = new jg5.c();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f381199b;

    static {
        boolean z17 = false;
        if (pg5.d.f435785a != null) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_global_emoji_v2, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmileyExtension", "enableTextViewEmojiProcess %s", java.lang.Boolean.valueOf(fj6));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j()) {
                z17 = fj6;
            }
        }
        f381199b = z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(android.view.View view, int i17) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (f381199b) {
            jg5.a aVar = jg5.a.f381195a;
            view.hashCode();
            if (view instanceof android.widget.EditText) {
                z17 = aVar.a(((android.widget.EditText) view).getInputType());
            } else if (view instanceof fl5.i) {
                z17 = aVar.a(((fl5.i) view).mo81564x652bd76e());
            } else if (view instanceof android.widget.TextView) {
                z17 = aVar.a(((android.widget.TextView) view).getInputType());
            } else {
                if (!(view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiProcessPreChecker", "hadInvalidInputType: unknown view type");
                }
                z17 = false;
            }
            if (z17) {
                return;
            }
            b(view, i17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (view instanceof android.widget.EditText) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiProcessTextProvider", "processViewWithoutCheck: EditText type view class name:" + view.getClass().getCanonicalName() + " hash:" + view.hashCode());
            android.widget.EditText editText = (android.widget.EditText) view;
            if (lg5.a.f400113b == null) {
                synchronized (lg5.a.f400112a) {
                    if (lg5.a.f400113b == null) {
                        lg5.a.f400113b = new lg5.a();
                    }
                }
            }
            editText.setEditableFactory(lg5.a.f400113b);
            editText.addTextChangedListener(new lg5.b(view, i17));
            return;
        }
        if (view instanceof fl5.i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiProcessTextProvider", "processViewWithoutCheck: IEditText type view class:" + view.getClass().getCanonicalName() + " hash:" + view.hashCode());
            fl5.i iVar = (fl5.i) view;
            iVar.mo81552xeb238c3a(new lg5.b(iVar.j(), i17));
            return;
        }
        if (view instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view;
            textView.setFilters(new android.text.InputFilter[]{new kg5.a(textView, i17)});
        } else {
            if (!(view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiProcessTextProvider", "processView: unknown view type");
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view;
            android.widget.TextView m84165x334dfae1 = c22624x85d69039.m84165x334dfae1();
            android.widget.TextView m84165x334dfae12 = c22624x85d69039.m84165x334dfae1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m84165x334dfae12, "getWrappedTextView(...)");
            m84165x334dfae1.setFilters(new android.text.InputFilter[]{new kg5.a(m84165x334dfae12, i17)});
        }
    }
}
