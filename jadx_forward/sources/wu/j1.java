package wu;

/* loaded from: classes9.dex */
public final class j1 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        s15.h hVar = item.f366530e;
        java.lang.String input = hVar.m75945x2fec8307(hVar.f384955d + 1);
        android.widget.TextView textView = (android.widget.TextView) containerView.findViewById(com.p314xaae8f345.mm.R.id.uxh);
        if (textView == null) {
            return;
        }
        hu.f fVar = this.f531143e;
        java.lang.String q17 = fVar.q();
        if (input instanceof java.lang.String) {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
            java.lang.String replaceAll = compile.matcher(input).replaceAll("\n");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
            java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("\r");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile2, "compile(...)");
            input = compile2.matcher(replaceAll).replaceAll("\n");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(input, "replaceAll(...)");
        }
        java.lang.String spannableString = new android.text.SpannableString(input).toString();
        int a17 = k01.d.a(q17);
        android.os.Bundle a18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.f272785f.a(a17);
        a18.putInt("key_wxa_short_link_launch_chat_type", a17);
        a18.putString("geta8key_username", q17);
        a18.putInt("KMsgType", 1);
        a18.putString("msgUsername", fVar.o());
        java.lang.Long p17 = fVar.p();
        a18.putString("serverMsgID", p17 != null ? p17.toString() : null);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = textView.getContext();
        int textSize = (int) textView.getTextSize();
        le0.r rVar = le0.x.P0;
        ((ke0.e) xVar).getClass();
        android.text.SpannableString s17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.s(context, spannableString, textSize, 1, a18, null, 4, rVar, true);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setText(s17);
        textView.setOnLongClickListener(new wu.h1(s17, this));
        textView.setOnTouchListener(new wu.i1());
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        s15.h hVar = item.f366530e;
        java.lang.String m75945x2fec8307 = hVar.m75945x2fec8307(hVar.f384955d + 1);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_chat_from", context.getClass().getName());
        intent.putExtra("key_chat_text", m75945x2fec8307);
        intent.putExtra("key_chat_preview_hide_toolbar", true);
        j45.l.u(context, ".ui.chatting.TextPreviewUI", intent, null);
        db5.f.j(context);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        com.p314xaae8f345.mm.ui.id.b(containerView.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570912em1, (android.view.ViewGroup) containerView, true);
    }
}
