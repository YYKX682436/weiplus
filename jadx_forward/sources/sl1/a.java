package sl1;

/* loaded from: classes5.dex */
public class a implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1228x636ee25.C12782xeed7bcb6 f490762d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1228x636ee25.C12782xeed7bcb6 c12782xeed7bcb6) {
        this.f490762d = c12782xeed7bcb6;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        this.f490762d.f173294h = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1228x636ee25.C12782xeed7bcb6 c12782xeed7bcb6 = this.f490762d;
        c12782xeed7bcb6.f173294h = false;
        sl1.c cVar = c12782xeed7bcb6.f173298o;
        if (cVar != null) {
            int progress = seekBar.getProgress();
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.y) cVar;
            yVar.getClass();
            b21.m.h(progress);
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 activityC16633xa26a1872 = yVar.f232388a;
            activityC16633xa26a1872.f232238g.m53552x3ae760af(progress);
            activityC16633xa26a1872.f232238g.a(true);
        }
    }
}
