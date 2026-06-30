package ab5;

/* loaded from: classes9.dex */
public class e implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab5.i f2927a;

    public e(ab5.i iVar) {
        this.f2927a = iVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        ((ab5.h) compoundButton.getTag()).f2934c = z17;
        ab5.i iVar = this.f2927a;
        if (z17) {
            iVar.f2936e++;
        } else {
            iVar.f2936e--;
        }
        android.widget.Button button = iVar.f2941m;
        if (button != null) {
            button.setText(java.lang.Math.max(0, iVar.f2936e) == 0 ? com.tencent.mm.R.string.b0x : com.tencent.mm.R.string.f490568yq);
        }
    }
}
