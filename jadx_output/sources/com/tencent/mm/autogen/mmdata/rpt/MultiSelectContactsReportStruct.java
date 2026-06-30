package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class MultiSelectContactsReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59354d;

    /* renamed from: e, reason: collision with root package name */
    public long f59355e;

    /* renamed from: f, reason: collision with root package name */
    public long f59356f;

    /* renamed from: g, reason: collision with root package name */
    public long f59357g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59358h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f59359i = "";

    /* renamed from: j, reason: collision with root package name */
    public long f59360j;

    /* renamed from: k, reason: collision with root package name */
    public long f59361k;

    /* renamed from: l, reason: collision with root package name */
    public long f59362l;

    /* renamed from: m, reason: collision with root package name */
    public long f59363m;

    @Override // jx3.a
    public int g() {
        return 29308;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59354d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59355e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59356f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59357g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59358h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59359i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59360j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59361k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59362l);
        stringBuffer.append(",");
        stringBuffer.append(this.f59363m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("op_result:");
        stringBuffer.append(this.f59354d);
        stringBuffer.append("\r\nop_type:");
        stringBuffer.append(this.f59355e);
        stringBuffer.append("\r\nselection_type:");
        stringBuffer.append(this.f59356f);
        stringBuffer.append("\r\nsub_biz_type:");
        stringBuffer.append(this.f59357g);
        stringBuffer.append("\r\nfriend_selector_page_sessionid:");
        stringBuffer.append(this.f59358h);
        stringBuffer.append("\r\nselected_container_op:");
        stringBuffer.append(this.f59359i);
        stringBuffer.append("\r\nselection_count:");
        stringBuffer.append(this.f59360j);
        stringBuffer.append("\r\nselection_fri_count:");
        stringBuffer.append(this.f59361k);
        stringBuffer.append("\r\norigin_list_fri_count:");
        stringBuffer.append(this.f59362l);
        stringBuffer.append("\r\nsubmit_fri_count:");
        stringBuffer.append(this.f59363m);
        return stringBuffer.toString();
    }
}
