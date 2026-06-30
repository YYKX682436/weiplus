package ab5;

/* loaded from: classes9.dex */
public class e implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab5.i f84460a;

    public e(ab5.i iVar) {
        this.f84460a = iVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        ((ab5.h) compoundButton.getTag()).f84467c = z17;
        ab5.i iVar = this.f84460a;
        if (z17) {
            iVar.f84469e++;
        } else {
            iVar.f84469e--;
        }
        android.widget.Button button = iVar.f84474m;
        if (button != null) {
            button.setText(java.lang.Math.max(0, iVar.f84469e) == 0 ? com.p314xaae8f345.mm.R.C30867xcad56011.b0x : com.p314xaae8f345.mm.R.C30867xcad56011.f572101yq);
        }
    }
}
