package com.tencent.kinda.gen;

/* loaded from: classes3.dex */
public final class KPickerOption {
    public java.lang.String mOptionId;
    public java.lang.String mText;

    public KPickerOption() {
    }

    public KPickerOption(java.lang.String str, java.lang.String str2) {
        this.mOptionId = str;
        this.mText = str2;
    }

    public java.lang.String getOptionId() {
        return this.mOptionId;
    }

    public java.lang.String getText() {
        return this.mText;
    }

    public java.lang.String toString() {
        return "KPickerOption{mOptionId=" + this.mOptionId + ",mText=" + this.mText + "}";
    }
}
