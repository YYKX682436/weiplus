package ti2;

/* loaded from: classes10.dex */
public final class p extends ti2.o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(gk2.e buContext, si2.c callback) {
        super(buContext, callback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // ti2.o
    public java.lang.String n() {
        return "VisitorSearchUserConvert";
    }

    @Override // ti2.o
    public void p(android.widget.TextView nicknameTv, android.text.SpannableString nickName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nicknameTv, "nicknameTv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        this.f501108f.getClass();
        if (r26.n0.L(nickName, "", 0, false, 6, null) >= 0) {
            int L = r26.n0.L(nickName, "", 0, false, 6, null);
            int i17 = L + 0;
            if (L < 0 || i17 >= nickName.length() || L > i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f501109g, "invalid index beginIndex:" + L + " endIndex:" + i17 + " nickName:" + ((java.lang.Object) nickName) + " keyword:");
            } else {
                nickName.setSpan(new android.text.style.ForegroundColorSpan(nicknameTv.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq)), L, i17, 33);
            }
        }
        super.p(nicknameTv, nickName);
    }
}
