package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.PerformanceStatistics */
/* loaded from: classes16.dex */
public class C29838x24207153 {

    /* renamed from: averageRenderTime */
    public long f75837x8645c780;

    /* renamed from: averageSwapBufferTime */
    public long f75838xdfac09d;

    /* renamed from: bigJank */
    public int f75839xf91e1a54;

    /* renamed from: duration */
    public long f75840x89444d94;

    /* renamed from: framesDropped */
    public int f75841xe265143a;

    /* renamed from: framesReceived */
    public int f75842x53c4cca7;

    /* renamed from: framesRendered */
    public int f75843x667a237b;

    /* renamed from: jank */
    public int f75844x31a934;

    /* renamed from: performanceHash */
    public int f75845xf281ad5e = hashCode();

    /* renamed from: renderFps */
    public double f75846x6da66373;

    /* renamed from: renderSwapBufferTimeNs */
    public long f75847x9d5f68bb;

    /* renamed from: renderTimeNs */
    public long f75848x2d4f02a8;

    /* renamed from: statisticsStartTimeNs */
    public long f75849xa0a2f51;

    /* renamed from: stutter */
    public double f75850x9005ff61;

    public C29838x24207153(org.p3371xd0ce3e8d.C29838x24207153 c29838x24207153) {
        this.f75842x53c4cca7 = c29838x24207153.f75842x53c4cca7;
        this.f75841xe265143a = c29838x24207153.f75841xe265143a;
        this.f75843x667a237b = c29838x24207153.f75843x667a237b;
        this.f75849xa0a2f51 = c29838x24207153.f75849xa0a2f51;
        this.f75848x2d4f02a8 = c29838x24207153.f75848x2d4f02a8;
        this.f75847x9d5f68bb = c29838x24207153.f75847x9d5f68bb;
        this.f75840x89444d94 = c29838x24207153.f75840x89444d94;
        this.f75846x6da66373 = c29838x24207153.f75846x6da66373;
        this.f75837x8645c780 = c29838x24207153.f75837x8645c780;
        this.f75838xdfac09d = c29838x24207153.f75838xdfac09d;
        this.f75844x31a934 = c29838x24207153.f75844x31a934;
        this.f75839xf91e1a54 = c29838x24207153.f75839xf91e1a54;
        this.f75850x9005ff61 = c29838x24207153.f75850x9005ff61;
    }

    /* renamed from: resetStatistics */
    public void m156209x36f793d2(long j17) {
        this.f75849xa0a2f51 = j17;
        this.f75842x53c4cca7 = 0;
        this.f75841xe265143a = 0;
        this.f75843x667a237b = 0;
        this.f75848x2d4f02a8 = 0L;
        this.f75847x9d5f68bb = 0L;
        this.f75840x89444d94 = 0L;
        this.f75846x6da66373 = 0.0d;
        this.f75837x8645c780 = 0L;
        this.f75838xdfac09d = 0L;
        this.f75844x31a934 = 0;
        this.f75839xf91e1a54 = 0;
        this.f75850x9005ff61 = 0.0d;
    }

    /* renamed from: toString */
    public java.lang.String m156210x9616526c() {
        return "PerformanceStatistics{framesReceived=" + this.f75842x53c4cca7 + ", framesDropped=" + this.f75841xe265143a + ", framesRendered=" + this.f75843x667a237b + ", statisticsStartTimeNs=" + this.f75849xa0a2f51 + ", renderTimeNs=" + this.f75848x2d4f02a8 + ", renderSwapBufferTimeNs=" + this.f75847x9d5f68bb + ", duration=" + this.f75840x89444d94 + ", renderFps=" + this.f75846x6da66373 + ", averageRenderTime=" + this.f75837x8645c780 + ", averageSwapBufferTime=" + this.f75838xdfac09d + ", jank=" + this.f75844x31a934 + ", bigJank=" + this.f75839xf91e1a54 + ", stutter=" + this.f75850x9005ff61 + ", performanceHash=" + this.f75845xf281ad5e + '}';
    }

    public C29838x24207153() {
    }
}
