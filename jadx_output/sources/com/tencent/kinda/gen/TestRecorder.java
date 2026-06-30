package com.tencent.kinda.gen;

/* loaded from: classes3.dex */
public final class TestRecorder {
    public java.util.ArrayList<com.tencent.kinda.gen.TouchEvent> mValues;
    public float mX;

    public TestRecorder() {
    }

    public TestRecorder(float f17, java.util.ArrayList<com.tencent.kinda.gen.TouchEvent> arrayList) {
        this.mX = f17;
        this.mValues = arrayList;
    }

    public java.util.ArrayList<com.tencent.kinda.gen.TouchEvent> getValues() {
        return this.mValues;
    }

    public float getX() {
        return this.mX;
    }

    public java.lang.String toString() {
        return "TestRecorder{mX=" + this.mX + ",mValues=" + this.mValues + "}";
    }
}
