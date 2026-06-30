package ju3;

/* loaded from: classes10.dex */
public final class s1 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e f383546a;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e c17025x1dde6f4e) {
        this.f383546a = c17025x1dde6f4e;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buttonView, "buttonView");
        buttonView.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e c17025x1dde6f4e = this.f383546a;
        if (((android.widget.Switch) c17025x1dde6f4e.findViewById(com.p314xaae8f345.mm.R.id.f565581cu1)).isChecked() && z17) {
            ((android.widget.Switch) c17025x1dde6f4e.findViewById(com.p314xaae8f345.mm.R.id.f565581cu1)).setChecked(false);
        }
        at0.n recordController = c17025x1dde6f4e.getRecordController();
        if (recordController != null) {
            recordController.n("cameraeffect.request.hdr", z17);
        }
    }
}
