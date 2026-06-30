package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f70947a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f70948b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f70949c;

    /* renamed from: d, reason: collision with root package name */
    public final long f70950d;

    /* renamed from: e, reason: collision with root package name */
    public long f70951e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final long f70952f;
    public java.lang.String field_mediaId;
    public long field_totalLen;

    /* renamed from: g, reason: collision with root package name */
    public final int f70953g;

    /* renamed from: h, reason: collision with root package name */
    public final int f70954h;

    /* renamed from: i, reason: collision with root package name */
    public final int f70955i;

    /* renamed from: j, reason: collision with root package name */
    public final int f70956j;

    /* renamed from: k, reason: collision with root package name */
    public final int f70957k;

    /* renamed from: l, reason: collision with root package name */
    public final int f70958l;

    /* renamed from: m, reason: collision with root package name */
    public final int f70959m;

    /* renamed from: n, reason: collision with root package name */
    public final int f70960n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f70961o;

    /* renamed from: p, reason: collision with root package name */
    public final int f70962p;

    /* renamed from: q, reason: collision with root package name */
    public final int f70963q;

    /* renamed from: r, reason: collision with root package name */
    public final long f70964r;

    public g2(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, dn.m mVar) {
        this.f70947a = "";
        this.f70948b = "task_default";
        this.field_totalLen = 0L;
        this.f70950d = 0L;
        this.f70952f = 0L;
        this.f70953g = 0;
        this.f70954h = 0;
        this.f70955i = 0;
        this.f70956j = 0;
        this.f70957k = 0;
        this.f70958l = 0;
        this.f70959m = 0;
        this.f70960n = 0;
        this.f70961o = "";
        this.f70962p = 0;
        this.f70963q = 0;
        this.f70964r = 0L;
        this.f70947a = str;
        this.f70948b = str2;
        this.field_mediaId = str3;
        this.f70949c = mVar.f241786e;
        this.field_totalLen = mVar.field_totalLen;
        this.f70950d = j17;
        this.f70952f = java.lang.Thread.currentThread().getId();
        this.f70953g = mVar.field_fileType;
        this.f70954h = mVar.field_appType;
        this.f70955i = mVar.field_bzScene;
        this.f70956j = mVar.f241789h;
        this.f70957k = mVar.field_chattype;
        this.f70958l = mVar.field_advideoflag;
        this.f70959m = mVar.field_largesvideo;
        this.f70960n = mVar.field_requestVideoFormat;
        java.lang.String str4 = mVar.field_snsScene;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f70961o = str4 != null ? str4 : "";
        this.f70962p = mVar.K ? 1 : 0;
        this.f70963q = mVar.Z;
        this.f70964r = java.lang.System.currentTimeMillis();
    }

    public java.lang.String toString() {
        return "CdnTaskReportInfo{cdnCallbackReportId='" + this.f70947a + "', taskName='" + this.f70948b + "', field_mediaId='" + this.field_mediaId + "', isSend=" + this.f70949c + ", field_totalLen=" + this.field_totalLen + ", startTime=" + this.f70950d + ", endTime=" + this.f70951e + ", threadId=" + this.f70952f + ", _FileType=" + this.f70953g + ", _AppType=" + this.f70954h + ", _BzScene=" + this.f70955i + ", _BizType=" + this.f70956j + ", _Chattype=" + this.f70957k + ", _Advideoflag=" + this.f70958l + ", _Largesvideo=" + this.f70959m + ", _RequestVideoFormat=" + this.f70960n + ", _SnsScene='" + this.f70961o + "', _SnsImageDownload=" + this.f70962p + ", _VideoTaskType=" + this.f70963q + ", localTime=" + this.f70964r + '}';
    }
}
