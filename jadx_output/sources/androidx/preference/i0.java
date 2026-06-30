package androidx.preference;

/* loaded from: classes13.dex */
public class i0 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.preference.SeekBarPreference f11829d;

    public i0(androidx.preference.SeekBarPreference seekBarPreference) {
        this.f11829d = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        android.widget.SeekBar seekBar;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        androidx.preference.SeekBarPreference seekBarPreference = this.f11829d;
        if ((!seekBarPreference.Y && (i17 == 21 || i17 == 22)) || i17 == 23 || i17 == 66 || (seekBar = seekBarPreference.W) == null) {
            return false;
        }
        return seekBar.onKeyDown(i17, keyEvent);
    }
}
