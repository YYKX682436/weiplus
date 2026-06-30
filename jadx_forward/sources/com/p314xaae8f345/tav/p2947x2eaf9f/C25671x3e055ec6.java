package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.AudioMix */
/* loaded from: classes16.dex */
public class C25671x3e055ec6<InputParameters extends com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae> {

    /* renamed from: inputParameters */
    protected java.util.List<InputParameters> f47440xcf994154;

    public C25671x3e055ec6(java.util.List<InputParameters> list) {
        this.f47440xcf994154 = list;
    }

    /* renamed from: getInputParameters */
    public java.util.List<InputParameters> m96684xb3fb131e() {
        return this.f47440xcf994154;
    }

    /* renamed from: getInputParametersWithTrackID */
    public InputParameters m96685xf92a8602(int i17) {
        for (InputParameters inputparameters : this.f47440xcf994154) {
            if (inputparameters.m96691xfe2e0f70() == i17) {
                return inputparameters;
            }
        }
        return null;
    }

    /* renamed from: release */
    public void m96686x41012807() {
        for (InputParameters inputparameters : this.f47440xcf994154) {
            if (inputparameters != null && inputparameters.m96689x2afdfa6f() != null) {
                inputparameters.m96689x2afdfa6f().mo96701x41012807();
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m96687x9616526c() {
        return "AudioMix{inputParameters=" + this.f47440xcf994154 + '}';
    }
}
