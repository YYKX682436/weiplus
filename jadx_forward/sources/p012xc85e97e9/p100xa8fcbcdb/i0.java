package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public class i0 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p100xa8fcbcdb.C1152xd6a13d96 f93362d;

    public i0(p012xc85e97e9.p100xa8fcbcdb.C1152xd6a13d96 c1152xd6a13d96) {
        this.f93362d = c1152xd6a13d96;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        android.widget.SeekBar seekBar;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        p012xc85e97e9.p100xa8fcbcdb.C1152xd6a13d96 c1152xd6a13d96 = this.f93362d;
        if ((!c1152xd6a13d96.Y && (i17 == 21 || i17 == 22)) || i17 == 23 || i17 == 66 || (seekBar = c1152xd6a13d96.W) == null) {
            return false;
        }
        return seekBar.onKeyDown(i17, keyEvent);
    }
}
