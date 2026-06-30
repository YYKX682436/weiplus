package com.tencent.matrix.trace.view;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f53068a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53069b;

    /* renamed from: c, reason: collision with root package name */
    public final int f53070c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.trace.view.FloatFrameView.LineChartView f53071d;

    public a(com.tencent.matrix.trace.view.FloatFrameView.LineChartView lineChartView, int i17, int i18) {
        this.f53071d = lineChartView;
        this.f53068a = r0;
        this.f53069b = i17;
        this.f53070c = i18;
        float[] fArr = {lineChartView.f53066y, 0.0f, (((60 - i17) * lineChartView.f53067z) / 60.0f) + (lineChartView.getWidth() - lineChartView.f53067z)};
    }
}
