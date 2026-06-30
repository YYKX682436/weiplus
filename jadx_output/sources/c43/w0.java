package c43;

/* loaded from: classes15.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u33.h f38486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c43.x0 f38487e;

    public w0(c43.x0 x0Var, u33.h hVar) {
        this.f38487e = x0Var;
        this.f38486d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        android.graphics.drawable.GradientDrawable gradientDrawable;
        c43.x0 x0Var = this.f38487e;
        android.widget.ImageView imageView = x0Var.f38517a.f38498p;
        u33.h hVar = this.f38486d;
        imageView.setContentDescription(((y33.e) hVar).field_nickName);
        android.widget.TextView textView = x0Var.f38517a.f38501s;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = x0Var.f38517a.f38492g;
        java.lang.String str = ((y33.e) hVar).field_nickName;
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
        com.tencent.mm.plugin.game.autogen.chatroom.TagInfo tagInfo = ((y33.e) hVar).field_tagInfo;
        if (tagInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(tagInfo.desc)) {
            x0Var.f38517a.f38502t.setVisibility(8);
        } else {
            x0Var.f38517a.f38502t.setVisibility(0);
            java.lang.String string = x0Var.f38517a.f38492g.getString(com.tencent.mm.R.string.fpo, tagInfo.desc);
            android.widget.TextView textView2 = x0Var.f38517a.f38502t;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = x0Var.f38517a.f38492g;
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, string));
            com.tencent.mm.plugin.game.autogen.chatroom.Color color = tagInfo.color;
            if (color != null) {
                java.lang.String str2 = color.dark_color;
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.Integer l17 = s33.y.l(str2);
                if (l17 != null) {
                    x0Var.f38517a.f38502t.setTextColor(l17.intValue());
                }
            }
        }
        com.tencent.mm.plugin.game.autogen.chatroom.UserRole userRole = ((y33.e) hVar).field_userRole;
        boolean z18 = true;
        if (userRole == null || userRole.role_icon == null) {
            x0Var.f38517a.f38504v.setVisibility(8);
            z17 = false;
        } else {
            x0Var.f38517a.f38504v.setVisibility(0);
            r53.y.a().e(x0Var.f38517a.f38504v, userRole.role_icon.icon_url, null, null);
            z17 = true;
        }
        if (userRole == null || com.tencent.mm.sdk.platformtools.t8.K0(userRole.desc)) {
            x0Var.f38517a.f38505w.setVisibility(8);
            z18 = z17;
        } else {
            x0Var.f38517a.f38505w.setVisibility(0);
            x0Var.f38517a.f38505w.setText(userRole.desc);
            java.lang.String str3 = userRole.word_color;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.Integer l18 = s33.y.l(str3);
            if (l18 != null) {
                x0Var.f38517a.f38505w.setTextColor(l18.intValue());
            }
        }
        if (z18) {
            java.lang.String str4 = userRole.background_color;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.Integer l19 = s33.y.l(str4 != null ? str4 : "");
            if (l19 != null && (gradientDrawable = (android.graphics.drawable.GradientDrawable) x0Var.f38517a.f38503u.getBackground()) != null) {
                gradientDrawable.setColor(l19.intValue());
            }
        }
        android.view.View view = x0Var.f38517a.f38503u;
        int i17 = z18 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$6$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$6$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        x0Var.f38517a.f38503u.setOnClickListener(new c43.v0(this, userRole));
    }
}
