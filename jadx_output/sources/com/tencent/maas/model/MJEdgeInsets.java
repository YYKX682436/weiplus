package com.tencent.maas.model;

/* loaded from: classes5.dex */
public class MJEdgeInsets {

    /* renamed from: a, reason: collision with root package name */
    public final float f48256a;

    /* renamed from: b, reason: collision with root package name */
    public final float f48257b;

    /* renamed from: c, reason: collision with root package name */
    public final float f48258c;

    /* renamed from: d, reason: collision with root package name */
    public final float f48259d;

    public MJEdgeInsets(float f17, float f18, float f19, float f27) {
        this.f48256a = f17;
        this.f48257b = f18;
        this.f48258c = f19;
        this.f48259d = f27;
    }

    public float getBottom() {
        return this.f48259d;
    }

    public float getLeft() {
        return this.f48256a;
    }

    public float getRight() {
        return this.f48258c;
    }

    public float getTop() {
        return this.f48257b;
    }

    public java.lang.String toString() {
        return "MJEdgeInsets{left=" + this.f48256a + ", top=" + this.f48257b + ", right=" + this.f48258c + ", bottom=" + this.f48259d + '}';
    }
}
