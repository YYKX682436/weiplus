package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class RemarkTagOperateLogStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f59966e;

    /* renamed from: f, reason: collision with root package name */
    public long f59967f;

    /* renamed from: g, reason: collision with root package name */
    public long f59968g;

    /* renamed from: h, reason: collision with root package name */
    public long f59969h;

    /* renamed from: i, reason: collision with root package name */
    public long f59970i;

    /* renamed from: j, reason: collision with root package name */
    public long f59971j;

    /* renamed from: k, reason: collision with root package name */
    public long f59972k;

    /* renamed from: l, reason: collision with root package name */
    public long f59973l;

    /* renamed from: m, reason: collision with root package name */
    public long f59974m;

    /* renamed from: n, reason: collision with root package name */
    public long f59975n;

    /* renamed from: o, reason: collision with root package name */
    public long f59976o;

    /* renamed from: p, reason: collision with root package name */
    public long f59977p;

    /* renamed from: q, reason: collision with root package name */
    public long f59978q;

    /* renamed from: r, reason: collision with root package name */
    public long f59979r;

    /* renamed from: s, reason: collision with root package name */
    public long f59980s;

    /* renamed from: u, reason: collision with root package name */
    public long f59982u;

    /* renamed from: v, reason: collision with root package name */
    public long f59983v;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59965d = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f59981t = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f59984w = "";

    @Override // jx3.a
    public int g() {
        return 22865;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59965d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59966e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59967f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59968g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59969h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59970i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59971j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59972k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59973l);
        stringBuffer.append(",");
        stringBuffer.append(this.f59974m);
        stringBuffer.append(",");
        stringBuffer.append(this.f59975n);
        stringBuffer.append(",");
        stringBuffer.append(this.f59976o);
        stringBuffer.append(",");
        stringBuffer.append(this.f59977p);
        stringBuffer.append(",");
        stringBuffer.append(this.f59978q);
        stringBuffer.append(",");
        stringBuffer.append(this.f59979r);
        stringBuffer.append(",");
        stringBuffer.append(this.f59980s);
        stringBuffer.append(",");
        stringBuffer.append(this.f59981t);
        stringBuffer.append(",");
        stringBuffer.append(this.f59982u);
        stringBuffer.append(",");
        stringBuffer.append(this.f59983v);
        stringBuffer.append(",");
        stringBuffer.append(this.f59984w);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("friendUsername:");
        stringBuffer.append(this.f59965d);
        stringBuffer.append("\r\nisClickAll:");
        stringBuffer.append(this.f59966e);
        stringBuffer.append("\r\nbuttonAddNewLabelCnt:");
        stringBuffer.append(this.f59967f);
        stringBuffer.append("\r\nsearchAddNewLabelCnt:");
        stringBuffer.append(this.f59968g);
        stringBuffer.append("\r\nselectAddLabelCnt:");
        stringBuffer.append(this.f59969h);
        stringBuffer.append("\r\nsearchAddLabelCnt:");
        stringBuffer.append(this.f59970i);
        stringBuffer.append("\r\noriLabelCnt:");
        stringBuffer.append(this.f59971j);
        stringBuffer.append("\r\nremovedLabelCnt:");
        stringBuffer.append(this.f59972k);
        stringBuffer.append("\r\naddedLabelCnt:");
        stringBuffer.append(this.f59973l);
        stringBuffer.append("\r\nstayTime:");
        stringBuffer.append(this.f59974m);
        stringBuffer.append("\r\ntotalLabelCnt:");
        stringBuffer.append(this.f59975n);
        stringBuffer.append("\r\nopResult:");
        stringBuffer.append(this.f59976o);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f59977p);
        stringBuffer.append("\r\naddremark:");
        stringBuffer.append(this.f59978q);
        stringBuffer.append("\r\nsource:");
        stringBuffer.append(this.f59979r);
        stringBuffer.append("\r\ndescWordCnt:");
        stringBuffer.append(this.f59980s);
        stringBuffer.append("\r\ndescPicSource:");
        stringBuffer.append(this.f59981t);
        stringBuffer.append("\r\nlogpressDeleteDescPicCnt:");
        stringBuffer.append(this.f59982u);
        stringBuffer.append("\r\ndetailpageDeleteDescPicCnt:");
        stringBuffer.append(this.f59983v);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f59984w);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct p(java.lang.String str) {
        this.f59965d = b("friendUsername", str, true);
        return this;
    }
}
