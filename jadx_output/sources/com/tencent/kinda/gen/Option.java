package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public final class Option {
    public java.lang.String mContent;
    public boolean mEnabled;

    public Option() {
    }

    public Option(java.lang.String str, boolean z17) {
        this.mContent = str;
        this.mEnabled = z17;
    }

    public java.lang.String getContent() {
        return this.mContent;
    }

    public boolean getEnabled() {
        return this.mEnabled;
    }

    public java.lang.String toString() {
        return "Option{mContent=" + this.mContent + ",mEnabled=" + this.mEnabled + "}";
    }
}
