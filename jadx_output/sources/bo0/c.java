package bo0;

/* loaded from: classes13.dex */
public class c implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup f22972a;

    public c(com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup multiLineRadioGroup, bo0.a aVar) {
        this.f22972a = multiLineRadioGroup;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        android.view.View findViewById;
        com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup multiLineRadioGroup = this.f22972a;
        if (multiLineRadioGroup.f68569f) {
            return;
        }
        multiLineRadioGroup.f68569f = true;
        int i17 = multiLineRadioGroup.f68567d;
        if (i17 != -1 && (findViewById = multiLineRadioGroup.findViewById(i17)) != null && (findViewById instanceof android.widget.RadioButton)) {
            ((android.widget.RadioButton) findViewById).setChecked(false);
        }
        multiLineRadioGroup.f68569f = false;
        multiLineRadioGroup.setCheckedId(compoundButton.getId());
    }
}
