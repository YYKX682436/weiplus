package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public final class TouchEvent {
    public com.tencent.kinda.gen.TouchAction mEvent;
    public float mX;
    public float mY;

    public TouchEvent() {
    }

    public TouchEvent(float f17, float f18, com.tencent.kinda.gen.TouchAction touchAction) {
        this.mX = f17;
        this.mY = f18;
        this.mEvent = touchAction;
    }

    public com.tencent.kinda.gen.TouchAction getEvent() {
        return this.mEvent;
    }

    public float getX() {
        return this.mX;
    }

    public float getY() {
        return this.mY;
    }

    public java.lang.String toString() {
        return "TouchEvent{mX=" + this.mX + ",mY=" + this.mY + ",mEvent=" + this.mEvent + "}";
    }
}
