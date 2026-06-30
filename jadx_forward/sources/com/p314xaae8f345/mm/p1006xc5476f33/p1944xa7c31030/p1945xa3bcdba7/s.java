package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7;

/* loaded from: classes8.dex */
public class s implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI f234482a;

    public s(com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI diagnosticSettingsUI) {
        this.f234482a = diagnosticSettingsUI;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI diagnosticSettingsUI = this.f234482a;
            diagnosticSettingsUI.f.setChecked(false);
            diagnosticSettingsUI.g.setChecked(false);
            diagnosticSettingsUI.h.setChecked(false);
        }
    }
}
