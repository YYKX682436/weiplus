package ti2;

/* loaded from: classes10.dex */
public final class q extends ti2.o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(gk2.e buContext, si2.c callback) {
        super(buContext, callback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // ti2.o, in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dkl;
    }

    @Override // ti2.o
    public java.lang.String n() {
        return "VoiceRoomUserConvert";
    }

    @Override // ti2.o
    public void o(android.widget.TextView descTv, km2.q data, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descTv, "descTv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        gk2.e eVar = this.f501107e;
        if (!((mm2.e1) eVar.a(mm2.e1.class)).c7()) {
            descTv.setVisibility(8);
            return;
        }
        descTv.setVisibility(0);
        if (data.f390725w == 0) {
            descTv.setText(descTv.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lza));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f501109g, "desc gone, position = 0, userIs = " + data);
            return;
        }
        java.lang.String R6 = ((mm2.y2) eVar.a(mm2.y2.class)).R6(data.f390725w);
        if (z17) {
            descTv.setText(descTv.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lz_, R6));
        } else {
            descTv.setText(descTv.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lze, R6));
        }
    }
}
