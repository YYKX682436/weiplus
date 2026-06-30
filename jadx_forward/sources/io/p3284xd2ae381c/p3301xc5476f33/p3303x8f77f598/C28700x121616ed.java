package io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598;

/* renamed from: io.flutter.plugin.editing.TextEditingDelta */
/* loaded from: classes15.dex */
public final class C28700x121616ed {
    private static final java.lang.String TAG = "TextEditingDelta";

    /* renamed from: deltaEnd */
    private int f71697x31a61a03;

    /* renamed from: deltaStart */
    private int f71698x614fab8a;

    /* renamed from: deltaText */
    private java.lang.CharSequence f71699x323d905;

    /* renamed from: newComposingEnd */
    private int f71700x9307a64c;

    /* renamed from: newComposingStart */
    private int f71701xf07f4993;

    /* renamed from: newSelectionEnd */
    private int f71702x4062316f;

    /* renamed from: newSelectionStart */
    private int f71703xb16397f6;

    /* renamed from: oldText */
    private java.lang.CharSequence f71704xadc7fbf4;

    public C28700x121616ed(java.lang.CharSequence charSequence, int i17, int i18, java.lang.CharSequence charSequence2, int i19, int i27, int i28, int i29) {
        this.f71703xb16397f6 = i19;
        this.f71702x4062316f = i27;
        this.f71701xf07f4993 = i28;
        this.f71700x9307a64c = i29;
        m138512x8b312bd(charSequence, charSequence2.toString(), i17, i18);
    }

    /* renamed from: setDeltas */
    private void m138512x8b312bd(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i17, int i18) {
        this.f71704xadc7fbf4 = charSequence;
        this.f71699x323d905 = charSequence2;
        this.f71698x614fab8a = i17;
        this.f71697x31a61a03 = i18;
    }

    /* renamed from: getDeltaEnd */
    public int m138513xad805779() {
        return this.f71697x31a61a03;
    }

    /* renamed from: getDeltaStart */
    public int m138514x4f906380() {
        return this.f71698x614fab8a;
    }

    /* renamed from: getDeltaText */
    public java.lang.CharSequence m138515x2914a4f() {
        return this.f71699x323d905;
    }

    /* renamed from: getNewComposingEnd */
    public int m138516x77697816() {
        return this.f71700x9307a64c;
    }

    /* renamed from: getNewComposingStart */
    public int m138517x43b3d0dd() {
        return this.f71701xf07f4993;
    }

    /* renamed from: getNewSelectionEnd */
    public int m138518x24c40339() {
        return this.f71702x4062316f;
    }

    /* renamed from: getNewSelectionStart */
    public int m138519x4981f40() {
        return this.f71703xb16397f6;
    }

    /* renamed from: getOldText */
    public java.lang.CharSequence m138520xeb9537be() {
        return this.f71704xadc7fbf4;
    }

    /* renamed from: toJSON */
    public org.json.JSONObject m138521xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("oldText", this.f71704xadc7fbf4.toString());
            jSONObject.put("deltaText", this.f71699x323d905.toString());
            jSONObject.put("deltaStart", this.f71698x614fab8a);
            jSONObject.put("deltaEnd", this.f71697x31a61a03);
            jSONObject.put("selectionBase", this.f71703xb16397f6);
            jSONObject.put("selectionExtent", this.f71702x4062316f);
            jSONObject.put("composingBase", this.f71701xf07f4993);
            jSONObject.put("composingExtent", this.f71700x9307a64c);
        } catch (org.json.JSONException e17) {
            io.p3284xd2ae381c.Log.e(TAG, "unable to create JSONObject: " + e17);
        }
        return jSONObject;
    }

    public C28700x121616ed(java.lang.CharSequence charSequence, int i17, int i18, int i19, int i27) {
        this.f71703xb16397f6 = i17;
        this.f71702x4062316f = i18;
        this.f71701xf07f4993 = i19;
        this.f71700x9307a64c = i27;
        m138512x8b312bd(charSequence, "", -1, -1);
    }
}
