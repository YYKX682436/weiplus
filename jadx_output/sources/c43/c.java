package c43;

/* loaded from: classes8.dex */
public class c extends c43.x {
    public android.widget.ImageView Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.TextView f38400l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.Button f38401p0;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.TextView f38402x0;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.TextView f38403y0;

    public c(android.view.View view, int i17) {
        super(view, i17);
    }

    @Override // c43.x
    public void k(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
        com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp chatroomMsgApp;
        java.lang.String str;
        if (chatroomMsgPack == null || (msgContent = chatroomMsgPack.msg_content) == null || (chatroomMsgApp = msgContent.chatroom_app) == null) {
            return;
        }
        this.f38402x0.setText(chatroomMsgApp.title);
        if (com.tencent.mm.sdk.platformtools.t8.K0(chatroomMsgApp.des)) {
            this.f38403y0.setVisibility(8);
        } else {
            this.f38403y0.setVisibility(0);
            this.f38403y0.setText(chatroomMsgApp.des);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(chatroomMsgApp.second_des)) {
            this.f38400l1.setVisibility(8);
        } else {
            this.f38400l1.setVisibility(0);
            this.f38400l1.setText(chatroomMsgApp.second_des);
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) this.f38401p0.getBackground();
        if (gradientDrawable != null) {
            com.tencent.mm.plugin.game.autogen.chatroom.Color color = chatroomMsgApp.button_bg_color;
            if (color == null || (str = color.dark_color) == null) {
                str = null;
            }
            gradientDrawable.setColor(s33.y.k(str, com.tencent.mm.R.color.f478544ae));
        }
        this.f38401p0.setText(chatroomMsgApp.button_des);
        java.lang.Object tag = this.Z.getTag();
        if ((tag instanceof java.lang.String) && ((java.lang.String) tag).equals(chatroomMsgApp.bg_pic_url)) {
            return;
        }
        r53.y.a().e(null, chatroomMsgApp.bg_pic_url, null, new c43.b(this, chatroomMsgApp));
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f38492g).inflate(com.tencent.mm.R.layout.ben, (android.view.ViewGroup) null);
        this.Z = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a1h);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.a1g);
        this.f38401p0 = button;
        button.setClickable(false);
        this.f38402x0 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.a1n);
        this.f38403y0 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.a1j);
        this.f38400l1 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.a1m);
        return inflate;
    }

    @Override // c43.x
    public void w(android.view.View view) {
        com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent;
        long j17;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = this.f38495m;
        if (chatroomMsgPack == null || (msgContent = chatroomMsgPack.msg_content) == null || msgContent.chatroom_app == null || s()) {
            return;
        }
        int h17 = s33.y.h(this.f38492g, this.f38495m.msg_content.chatroom_app.jump_info);
        if (h17 == 1) {
            j17 = 6;
        } else if (h17 == 2) {
            j17 = 7;
        } else if (h17 != 3) {
            return;
        } else {
            j17 = 28;
        }
        long j18 = j17;
        com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
        long j19 = this.f38494i;
        long j27 = this.f38493h;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack2 = this.f38495m;
        fVar.g(1L, j18, j19, j27, chatroomMsgPack2.seq, chatroomMsgPack2.from_username, 0L, this.X);
    }
}
