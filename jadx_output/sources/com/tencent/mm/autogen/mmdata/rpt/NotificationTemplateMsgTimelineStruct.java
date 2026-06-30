package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class NotificationTemplateMsgTimelineStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59729d;

    /* renamed from: e, reason: collision with root package name */
    public long f59730e;

    /* renamed from: f, reason: collision with root package name */
    public long f59731f;

    /* renamed from: h, reason: collision with root package name */
    public long f59733h;

    /* renamed from: k, reason: collision with root package name */
    public long f59736k;

    /* renamed from: q, reason: collision with root package name */
    public long f59742q;

    /* renamed from: r, reason: collision with root package name */
    public long f59743r;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59732g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f59734i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f59735j = "";

    /* renamed from: l, reason: collision with root package name */
    public long f59737l = -1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f59738m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f59739n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f59740o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f59741p = "";

    @Override // jx3.a
    public int g() {
        return 34077;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59729d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59730e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59731f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59732g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59733h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59734i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59735j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59736k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59737l);
        stringBuffer.append(",");
        stringBuffer.append(this.f59738m);
        stringBuffer.append(",");
        stringBuffer.append(this.f59739n);
        stringBuffer.append(",");
        stringBuffer.append(this.f59740o);
        stringBuffer.append(",");
        stringBuffer.append(this.f59741p);
        stringBuffer.append(",");
        stringBuffer.append(this.f59742q);
        stringBuffer.append(",");
        stringBuffer.append(this.f59743r);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("releaseTime:");
        stringBuffer.append(this.f59729d);
        stringBuffer.append("\r\nopTimestamp:");
        stringBuffer.append(this.f59730e);
        stringBuffer.append("\r\ncontainerType:");
        stringBuffer.append(this.f59731f);
        stringBuffer.append("\r\nRawUserName:");
        stringBuffer.append(this.f59732g);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f59733h);
        stringBuffer.append("\r\nmsgtitle:");
        stringBuffer.append(this.f59734i);
        stringBuffer.append("\r\nmsgcontent:");
        stringBuffer.append(this.f59735j);
        stringBuffer.append("\r\nisRead:");
        stringBuffer.append(this.f59736k);
        stringBuffer.append("\r\nisCluster:");
        stringBuffer.append(this.f59737l);
        stringBuffer.append("\r\ntemplateid:");
        stringBuffer.append(this.f59738m);
        stringBuffer.append("\r\ntemplateUniqueMsgId:");
        stringBuffer.append(this.f59739n);
        stringBuffer.append("\r\nclusterId:");
        stringBuffer.append(this.f59740o);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f59741p);
        stringBuffer.append("\r\nclusterCount:");
        stringBuffer.append(this.f59742q);
        stringBuffer.append("\r\nopType:");
        stringBuffer.append(this.f59743r);
        return stringBuffer.toString();
    }
}
