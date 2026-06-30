package z63;

/* loaded from: classes5.dex */
public class y implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab f551983d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab) {
        this.f551983d = activityC16081x2d23fdab;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.System.currentTimeMillis();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab.U;
        com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab = this.f551983d;
        activityC16081x2d23fdab.d7();
        if (activityC16081x2d23fdab.f223766v instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) {
            java.lang.String obj = editable.toString();
            try {
                obj = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).wi(obj);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "afterTextChanged() emojiSoftBank2Unicode %s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
            int intValue = ((java.lang.Integer) ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) activityC16081x2d23fdab.f223766v).getTag(com.p314xaae8f345.mm.R.id.guj)).intValue();
            int y17 = x63.g.y(obj);
            if (intValue == 1) {
                if (y17 > x63.g.u() * 2) {
                    int l17 = x63.g.l(obj, x63.g.u() * 2);
                    editable.delete(l17, editable.length());
                    obj = obj.substring(0, l17);
                }
                y63.a aVar = activityC16081x2d23fdab.B;
                aVar.H = obj;
                aVar.L = 1;
            } else if (intValue == 2) {
                activityC16081x2d23fdab.B.I = obj;
            } else if (intValue == 3) {
                y63.b bVar = (y63.b) ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) activityC16081x2d23fdab.f223766v).getTag(com.p314xaae8f345.mm.R.id.guh);
                if (bVar != null) {
                    if (y17 > x63.g.v() * 2) {
                        int l18 = x63.g.l(obj, x63.g.v() * 2);
                        editable.delete(l18, editable.length());
                        obj = obj.substring(0, l18);
                    }
                    bVar.f541189e = obj;
                }
            } else if (intValue == 4) {
                if (y17 > x63.g.t() * 2) {
                    int l19 = x63.g.l(obj, x63.g.t() * 2);
                    editable.delete(l19, editable.length());
                    obj = obj.substring(0, l19);
                }
                activityC16081x2d23fdab.B.f541184J = obj;
            }
        }
        activityC16081x2d23fdab.g7(false);
        activityC16081x2d23fdab.f223766v.postDelayed(new z63.n(this), 100L);
        java.lang.System.currentTimeMillis();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
