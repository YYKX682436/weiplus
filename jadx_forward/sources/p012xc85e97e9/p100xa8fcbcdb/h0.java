package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public class h0 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p100xa8fcbcdb.C1152xd6a13d96 f93360d;

    public h0(p012xc85e97e9.p100xa8fcbcdb.C1152xd6a13d96 c1152xd6a13d96) {
        this.f93360d = c1152xd6a13d96;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        if (z17) {
            p012xc85e97e9.p100xa8fcbcdb.C1152xd6a13d96 c1152xd6a13d96 = this.f93360d;
            if (c1152xd6a13d96.V) {
                return;
            }
            c1152xd6a13d96.N(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        this.f93360d.V = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        p012xc85e97e9.p100xa8fcbcdb.C1152xd6a13d96 c1152xd6a13d96 = this.f93360d;
        c1152xd6a13d96.V = false;
        if (seekBar.getProgress() + c1152xd6a13d96.S != c1152xd6a13d96.R) {
            c1152xd6a13d96.N(seekBar);
        }
    }
}
