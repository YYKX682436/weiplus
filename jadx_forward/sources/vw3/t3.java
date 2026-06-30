package vw3;

/* loaded from: classes12.dex */
public final class t3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI f522649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f522650e;

    public t3(com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI repairerMsgResendUI, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f522649d = repairerMsgResendUI;
        this.f522650e = f9Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.text.Editable text;
        java.lang.String obj;
        android.text.Editable text2;
        java.lang.String obj2;
        android.text.Editable text3;
        java.lang.String obj3;
        android.text.Editable text4;
        java.lang.String obj4;
        android.text.Editable text5;
        android.text.Editable text6;
        java.lang.String obj5;
        android.text.Editable text7;
        android.text.Editable text8;
        android.text.Editable text9;
        java.lang.String obj6;
        android.text.Editable text10;
        java.lang.String obj7;
        android.text.Editable text11;
        java.lang.String obj8;
        android.text.Editable text12;
        java.lang.String obj9;
        android.text.Editable text13;
        android.text.Editable text14;
        android.text.Editable text15;
        java.lang.String obj10;
        android.text.Editable text16;
        android.text.Editable text17;
        vw3.m3[] m3VarArr = vw3.m3.f522564d;
        if (i17 == 0) {
            com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI repairerMsgResendUI = this.f522649d;
            int i18 = com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI.h;
            repairerMsgResendUI.V6();
            return;
        }
        if (i17 == 1) {
            android.widget.EditText editText = (android.widget.EditText) this.f522649d.f.get("createTime");
            if (editText != null) {
                editText.setText(java.lang.String.valueOf(c01.id.c()));
                return;
            }
            return;
        }
        if (i17 == 2) {
            r45.b50 b50Var = new r45.b50();
            b50Var.f452063d = 5;
            r45.j4 j4Var = new r45.j4();
            r45.du5 du5Var = new r45.du5();
            android.widget.EditText editText2 = (android.widget.EditText) this.f522649d.f.get("fromUser");
            du5Var.f454289d = (editText2 == null || (text17 = editText2.getText()) == null) ? null : text17.toString();
            du5Var.f454290e = true;
            j4Var.f459091e = du5Var;
            r45.du5 du5Var2 = new r45.du5();
            android.widget.EditText editText3 = (android.widget.EditText) this.f522649d.f.get("toUser");
            du5Var2.f454289d = (editText3 == null || (text16 = editText3.getText()) == null) ? null : text16.toString();
            du5Var2.f454290e = true;
            j4Var.f459092f = du5Var2;
            android.widget.EditText editText4 = (android.widget.EditText) this.f522649d.f.get("msgSvrId");
            j4Var.f459101r = (editText4 == null || (text15 = editText4.getText()) == null || (obj10 = text15.toString()) == null) ? 0L : java.lang.Long.parseLong(obj10);
            android.widget.EditText editText5 = (android.widget.EditText) this.f522649d.f.get("msgSource");
            j4Var.f459099p = (editText5 == null || (text14 = editText5.getText()) == null) ? null : text14.toString();
            r45.du5 du5Var3 = new r45.du5();
            android.widget.EditText editText6 = (android.widget.EditText) this.f522649d.f.get("msgContent");
            du5Var3.f454289d = (editText6 == null || (text13 = editText6.getText()) == null) ? null : text13.toString();
            du5Var3.f454290e = true;
            j4Var.f459094h = du5Var3;
            android.widget.EditText editText7 = (android.widget.EditText) this.f522649d.f.get("msgSeq");
            j4Var.f459102s = (editText7 == null || (text12 = editText7.getText()) == null || (obj9 = text12.toString()) == null) ? 0 : java.lang.Integer.parseInt(obj9);
            android.widget.EditText editText8 = (android.widget.EditText) this.f522649d.f.get("msgType");
            j4Var.f459093g = (editText8 == null || (text11 = editText8.getText()) == null || (obj8 = text11.toString()) == null) ? 0 : java.lang.Integer.parseInt(obj8);
            android.widget.EditText editText9 = (android.widget.EditText) this.f522649d.f.get("msgStatus");
            j4Var.f459095i = (editText9 == null || (text10 = editText9.getText()) == null || (obj7 = text10.toString()) == null) ? 0 : java.lang.Integer.parseInt(obj7);
            android.widget.EditText editText10 = (android.widget.EditText) this.f522649d.f.get("imgStatus");
            j4Var.f459096m = (editText10 == null || (text9 = editText10.getText()) == null || (obj6 = text9.toString()) == null) ? 0 : java.lang.Integer.parseInt(obj6);
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(j4Var.mo14344x5f01b1f6());
            b50Var.f452064e = cu5Var;
            ((ku5.t0) ku5.t0.f394148d).l(new vw3.q3(b50Var), 5000L, w11.h2.f523583f);
            android.widget.Toast.makeText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "5秒后将推送该条消息!", 0).show();
            this.f522649d.finish();
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f522650e;
            if (!(f9Var != null && f9Var.mo78013xfb85f7b0() == 43)) {
                android.widget.Toast.makeText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "当前消息不是视频消息!", 0).show();
                return;
            }
            com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI repairerMsgResendUI2 = this.f522649d;
            int i19 = com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI.h;
            t21.v2 g17 = ((t21.w2) ((wf0.w1) ((jz5.n) repairerMsgResendUI2.g).mo141623x754a37bb())).g(this.f522650e.z0());
            if (g17 != null) {
                java.lang.String g18 = g17.g();
                if (!(g18 == null || g18.length() == 0)) {
                    java.lang.String g19 = g17.g();
                    java.lang.String c17 = t21.v2.c(g17.g());
                    if (!(c17 == null || c17.length() == 0)) {
                        java.lang.String g27 = g17.g();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g27, "getRecvXml(...)");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
                        g19 = r26.i0.t(g27, c17, this.f522649d.d, false);
                    }
                    r45.b50 b50Var2 = new r45.b50();
                    b50Var2.f452063d = 5;
                    r45.j4 j4Var2 = new r45.j4();
                    j4Var2.f459098o = (int) (c01.id.c() - 2592000000L);
                    r45.du5 du5Var4 = new r45.du5();
                    android.widget.EditText editText11 = (android.widget.EditText) this.f522649d.f.get("fromUser");
                    du5Var4.f454289d = (editText11 == null || (text8 = editText11.getText()) == null) ? null : text8.toString();
                    du5Var4.f454290e = true;
                    j4Var2.f459091e = du5Var4;
                    r45.du5 du5Var5 = new r45.du5();
                    android.widget.EditText editText12 = (android.widget.EditText) this.f522649d.f.get("toUser");
                    du5Var5.f454289d = (editText12 == null || (text7 = editText12.getText()) == null) ? null : text7.toString();
                    du5Var5.f454290e = true;
                    j4Var2.f459092f = du5Var5;
                    android.widget.EditText editText13 = (android.widget.EditText) this.f522649d.f.get("msgSvrId");
                    j4Var2.f459101r = (editText13 == null || (text6 = editText13.getText()) == null || (obj5 = text6.toString()) == null) ? 0L : java.lang.Long.parseLong(obj5);
                    android.widget.EditText editText14 = (android.widget.EditText) this.f522649d.f.get("msgSource");
                    j4Var2.f459099p = (editText14 == null || (text5 = editText14.getText()) == null) ? null : text5.toString();
                    r45.du5 du5Var6 = new r45.du5();
                    du5Var6.f454289d = g19;
                    du5Var6.f454290e = true;
                    j4Var2.f459094h = du5Var6;
                    android.widget.EditText editText15 = (android.widget.EditText) this.f522649d.f.get("msgSeq");
                    j4Var2.f459102s = (editText15 == null || (text4 = editText15.getText()) == null || (obj4 = text4.toString()) == null) ? 0 : java.lang.Integer.parseInt(obj4);
                    android.widget.EditText editText16 = (android.widget.EditText) this.f522649d.f.get("msgType");
                    j4Var2.f459093g = (editText16 == null || (text3 = editText16.getText()) == null || (obj3 = text3.toString()) == null) ? 0 : java.lang.Integer.parseInt(obj3);
                    android.widget.EditText editText17 = (android.widget.EditText) this.f522649d.f.get("msgStatus");
                    j4Var2.f459095i = (editText17 == null || (text2 = editText17.getText()) == null || (obj2 = text2.toString()) == null) ? 0 : java.lang.Integer.parseInt(obj2);
                    android.widget.EditText editText18 = (android.widget.EditText) this.f522649d.f.get("imgStatus");
                    j4Var2.f459096m = (editText18 == null || (text = editText18.getText()) == null || (obj = text.toString()) == null) ? 0 : java.lang.Integer.parseInt(obj);
                    r45.cu5 cu5Var2 = new r45.cu5();
                    cu5Var2.d(j4Var2.mo14344x5f01b1f6());
                    b50Var2.f452064e = cu5Var2;
                    ((ku5.t0) ku5.t0.f394148d).l(new vw3.s3(b50Var2), 5000L, w11.h2.f523583f);
                    android.widget.Toast.makeText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "5秒后将推送视频过期消息!", 0).show();
                    this.f522649d.finish();
                    return;
                }
            }
            android.widget.Toast.makeText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "未找到视频信息或 recvXml 为空!", 0).show();
        }
    }
}
