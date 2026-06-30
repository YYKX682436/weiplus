package com.p314xaae8f345.p592x631407a.api.p594x414ef28f;

/* renamed from: com.tencent.midas.api.request.APMidasBaseRequest */
/* loaded from: classes13.dex */
public abstract class AbstractC4741xef9abf3 implements java.io.Serializable {

    /* renamed from: MALL_TYPE_DEFAULT */
    public static final int f20171x715ca267 = 0;

    /* renamed from: MALL_TYPE_GROUPBUY */
    public static final int f20172xb1ff3c21 = 1;

    /* renamed from: MALL_TYPE_VMALL */
    public static final int f20173xcc1c7d30 = 2;

    /* renamed from: serialVersionUID */
    private static final long f20174x3a3ed56c = -9123623786877679280L;

    /* renamed from: resData */
    public byte[] f20188x4154cc6a;

    /* renamed from: reserv */
    public java.lang.String f20190xc84d8cc9;

    /* renamed from: returnUrl */
    public java.lang.String f20191xc8c3c21f;

    /* renamed from: offerId */
    public java.lang.String f20183xa3aefc97 = "";

    /* renamed from: openId */
    public java.lang.String f20184xc3c3c505 = "";

    /* renamed from: openKey */
    public java.lang.String f20185xb4b4e3b5 = "";

    /* renamed from: sessionId */
    public java.lang.String f20193x243a3e51 = "";

    /* renamed from: sessionType */
    public java.lang.String f20194xfea94af0 = "";

    /* renamed from: zoneId */
    public java.lang.String f20195xd67ef1e7 = "";

    /* renamed from: pf, reason: collision with root package name */
    public java.lang.String f134673pf = "";

    /* renamed from: pfKey */
    public java.lang.String f20186x659cc89 = "";

    /* renamed from: resId */
    public int f20189x67619db = 0;

    /* renamed from: acctType */
    public java.lang.String f20175x80d559ed = "common";

    /* renamed from: saveValue */
    public java.lang.String f20192xa7245f4 = "";

    /* renamed from: isCanChange */
    public boolean f20178x2c2fa596 = true;

    /* renamed from: mallType */
    public int f20179x481df6e = 0;

    /* renamed from: h5Url */
    public java.lang.String f20177x5d2f162 = "";

    /* renamed from: remark */
    public java.lang.String f20187xc84ac380 = "";

    /* renamed from: mpInfo */
    public com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3.APMidasMPInfo f20182xc04d5cf1 = new com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3.APMidasMPInfo();

    /* renamed from: extendInfo */
    public com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3.APMidasExtendInfo f20176x93447ae8 = new com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3.APMidasExtendInfo();

    /* renamed from: mobileInfo */
    public java.lang.String f20180x81904870 = "";

    /* renamed from: mobileInfoLen */
    public java.lang.String f20181x755ecb85 = "";

    /* renamed from: com.tencent.midas.api.request.APMidasBaseRequest$APMidasExtendInfo */
    /* loaded from: classes13.dex */
    public class APMidasExtendInfo implements java.io.Serializable {

        /* renamed from: serialVersionUID */
        private static final long f20196x3a3ed56c = -5387967973327966068L;

        /* renamed from: unit */
        public java.lang.String f20205x36d984 = "";

        /* renamed from: isShowNum */
        public boolean f20203x58a962bf = true;

        /* renamed from: isShowListOtherNum */
        public boolean f20202x523b89fb = true;

        /* renamed from: isHidePrice */
        public boolean f20201x784b1f1d = false;

        /* renamed from: ecOfferId */
        public java.lang.String f20199xb1fbba19 = null;

        /* renamed from: ecSubOfferId */
        public java.lang.String f20200x5fb88975 = null;

        /* renamed from: contractDomain */
        public java.lang.String f20197x1eed3c76 = null;

        /* renamed from: contractMethod */
        public java.lang.String f20198x2dbf3893 = null;

        /* renamed from: wxAppId */
        public java.lang.String f20206x6793a4bb = null;

        public APMidasExtendInfo() {
        }
    }

    /* renamed from: com.tencent.midas.api.request.APMidasBaseRequest$APMidasMPInfo */
    /* loaded from: classes13.dex */
    public class APMidasMPInfo implements java.io.Serializable {

        /* renamed from: serialVersionUID */
        private static final long f20207x3a3ed56c = 631101753621041424L;

        /* renamed from: payChannel */
        public java.lang.String f20213xb6c1d73b = "";

        /* renamed from: discountType */
        public java.lang.String f20208x20c1f01b = "";

        /* renamed from: discountUrl */
        public java.lang.String f20209xe006446e = "";

        /* renamed from: drmInfo */
        public java.lang.String f20211x729a76ed = "";

        /* renamed from: discoutId */
        public java.lang.String f20210xf8c64494 = "";

        /* renamed from: extras */
        public java.lang.String f20212xb32aee63 = "";

        public APMidasMPInfo() {
        }
    }

    /* renamed from: getAcctType */
    public java.lang.String m41453xfcaf9763() {
        return this.f20175x80d559ed;
    }

    /* renamed from: getContractDomain */
    public java.lang.String m41454xd85096c() {
        return this.f20176x93447ae8.f20197x1eed3c76;
    }

    /* renamed from: getContractMethod */
    public java.lang.String m41455x1c570589() {
        return this.f20176x93447ae8.f20198x2dbf3893;
    }

    /* renamed from: getDiscountType */
    public java.lang.String m41456x81b48291() {
        return this.f20182xc04d5cf1.f20208x20c1f01b;
    }

    /* renamed from: getDiscountUrl */
    public java.lang.String m41457xb9dc8b38() {
        return this.f20182xc04d5cf1.f20209xe006446e;
    }

    /* renamed from: getDiscoutId */
    public java.lang.String m41458xf833b5de() {
        return this.f20182xc04d5cf1.f20210xf8c64494;
    }

    /* renamed from: getDrmInfo */
    public java.lang.String m41459xb067b2b7() {
        return this.f20182xc04d5cf1.f20211x729a76ed;
    }

    /* renamed from: getEcOfferId */
    public java.lang.String m41460xb1692b63() {
        return this.f20176x93447ae8.f20199xb1fbba19;
    }

    /* renamed from: getEcSubOfferId */
    public java.lang.String m41461xc0ab1beb() {
        return this.f20176x93447ae8.f20200x5fb88975;
    }

    /* renamed from: getExtras */
    public java.lang.String m41462x18421159() {
        return this.f20182xc04d5cf1.f20212xb32aee63;
    }

    /* renamed from: getH5Url */
    public java.lang.String m41463x747097ac() {
        return this.f20177x5d2f162;
    }

    /* renamed from: getHidePrice */
    public boolean m41464x317b4e71() {
        return this.f20176x93447ae8.f20201x784b1f1d;
    }

    /* renamed from: getIsCanChange */
    public boolean m41465x605ec60() {
        return this.f20178x2c2fa596;
    }

    /* renamed from: getMallType */
    public int m41466x805c1ce4() {
        return this.f20179x481df6e;
    }

    /* renamed from: getMobileInfo */
    public java.lang.String m41467x6fd10066() {
        return this.f20180x81904870;
    }

    /* renamed from: getMobileInfoLen */
    public java.lang.String m41468x32be87cf() {
        return this.f20181x755ecb85;
    }

    /* renamed from: getOfferId */
    public java.lang.String m41469xe17c3861() {
        return this.f20183xa3aefc97;
    }

    /* renamed from: getOpenId */
    public java.lang.String m41470x28dae7fb() {
        return this.f20184xc3c3c505;
    }

    /* renamed from: getOpenKey */
    public java.lang.String m41471xf2821f7f() {
        return this.f20185xb4b4e3b5;
    }

    /* renamed from: getPayChannel */
    public java.lang.String m41472xa5028f31() {
        return this.f20182xc04d5cf1.f20213xb6c1d73b;
    }

    /* renamed from: getPf */
    public java.lang.String m41473x5db1bec() {
        return this.f134673pf;
    }

    /* renamed from: getPfKey */
    public java.lang.String m41474x74f772d3() {
        return this.f20186x659cc89;
    }

    /* renamed from: getRemark */
    public java.lang.String m41475x2d61e676() {
        return this.f20187xc84ac380;
    }

    /* renamed from: getResData */
    public byte[] m41476x7f220834() {
        return this.f20188x4154cc6a;
    }

    /* renamed from: getResId */
    public int m41477x7513c025() {
        return this.f20189x67619db;
    }

    /* renamed from: getReserv */
    public java.lang.String m41478x2d64afbf() {
        return this.f20190xc84d8cc9;
    }

    /* renamed from: getReturnUrl */
    public java.lang.String m41479xc8313369() {
        return this.f20191xc8c3c21f;
    }

    /* renamed from: getSaveValue */
    public java.lang.String m41480x9dfb73e() {
        return this.f20192xa7245f4;
    }

    /* renamed from: getSessionId */
    public java.lang.String m41481x23a7af9b() {
        return this.f20193x243a3e51;
    }

    /* renamed from: getSessionType */
    public java.lang.String m41482xd87f91ba() {
        return this.f20194xfea94af0;
    }

    /* renamed from: getShowListOtherNum */
    public boolean m41483x502b3427() {
        return this.f20176x93447ae8.f20202x523b89fb;
    }

    /* renamed from: getShowNum */
    public boolean m41484xb9055713() {
        return this.f20176x93447ae8.f20203x58a962bf;
    }

    /* renamed from: getUnit */
    public java.lang.String m41485xfb8641fa() {
        return this.f20176x93447ae8.f20205x36d984;
    }

    /* renamed from: getWxAppId */
    public java.lang.String m41486xa560e085() {
        return this.f20176x93447ae8.f20206x6793a4bb;
    }

    /* renamed from: getZoneId */
    public java.lang.String m41487x3b9614dd() {
        return this.f20195xd67ef1e7;
    }

    /* renamed from: setAcctType */
    public void m41488xf767f86f(java.lang.String str) {
        this.f20175x80d559ed = str;
    }

    /* renamed from: setContractDomain */
    public void m41489xd57b7178(java.lang.String str) {
        this.f20176x93447ae8.f20197x1eed3c76 = str;
    }

    /* renamed from: setContractMethod */
    public void m41490xe44d6d95(java.lang.String str) {
        this.f20176x93447ae8.f20198x2dbf3893 = str;
    }

    /* renamed from: setDiscountType */
    public void m41491xb7fd7d9d(java.lang.String str) {
        this.f20182xc04d5cf1.f20208x20c1f01b = str;
    }

    /* renamed from: setDiscountUrl */
    public void m41492x5041feac(java.lang.String str) {
        this.f20182xc04d5cf1.f20209xe006446e = str;
    }

    /* renamed from: setDiscoutId */
    public void m41493x54877652(java.lang.String str) {
        this.f20182xc04d5cf1.f20210xf8c64494 = str;
    }

    /* renamed from: setDrmInfo */
    public void m41494x23d9002b(java.lang.String str) {
        this.f20182xc04d5cf1.f20211x729a76ed = str;
    }

    /* renamed from: setEcOfferId */
    public void m41495xdbcebd7(java.lang.String str) {
        this.f20176x93447ae8.f20199xb1fbba19 = str;
    }

    /* renamed from: setEcSubOfferId */
    public void m41496xf6f416f7(java.lang.String str) {
        this.f20176x93447ae8.f20200x5fb88975 = str;
    }

    /* renamed from: setExtras */
    public void m41497xb774565(java.lang.String str) {
        this.f20182xc04d5cf1.f20212xb32aee63 = str;
    }

    /* renamed from: setH5Url */
    public void m41498x52feb220(java.lang.String str) {
        this.f20177x5d2f162 = str;
    }

    /* renamed from: setHidePrice */
    public void m41499x8dcf0ee5(boolean z17) {
        this.f20176x93447ae8.f20201x784b1f1d = z17;
    }

    /* renamed from: setIsCanChange */
    public void m41500x9c6b5fd4(boolean z17) {
        this.f20178x2c2fa596 = z17;
    }

    /* renamed from: setMallType */
    public void m41501x7b147df0(int i17) {
        this.f20179x481df6e = i17;
    }

    /* renamed from: setMobileInfo */
    public void m41502x9df54e72(java.lang.String str) {
        this.f20180x81904870 = str;
    }

    /* renamed from: setMobileInfoLen */
    public void m41503xc594ee43(java.lang.String str) {
        this.f20181x755ecb85 = str;
    }

    /* renamed from: setOfferId */
    public void m41504x54ed85d5(java.lang.String str) {
        this.f20183xa3aefc97 = str;
    }

    /* renamed from: setOpenId */
    public void m41505x1c101c07(java.lang.String str) {
        this.f20184xc3c3c505 = str;
    }

    /* renamed from: setOpenKey */
    public void m41506x65f36cf3(java.lang.String str) {
        this.f20185xb4b4e3b5 = str;
    }

    /* renamed from: setPayChannel */
    public void m41507xd326dd3d(java.lang.String str) {
        this.f20182xc04d5cf1.f20213xb6c1d73b = str;
    }

    /* renamed from: setPf */
    public void m41508x68435f8(java.lang.String str) {
        this.f134673pf = str;
    }

    /* renamed from: setPfKey */
    public void m41509x53858d47(java.lang.String str) {
        this.f20186x659cc89 = str;
    }

    /* renamed from: setRemark */
    public void m41510x20971a82(java.lang.String str) {
        this.f20187xc84ac380 = str;
    }

    /* renamed from: setResData */
    public void m41511xf29355a8(byte[] bArr) {
        this.f20188x4154cc6a = bArr;
    }

    /* renamed from: setResId */
    public void m41512x53a1da99(int i17) {
        this.f20189x67619db = i17;
    }

    /* renamed from: setReserv */
    public void m41513x2099e3cb(java.lang.String str) {
        this.f20190xc84d8cc9 = str;
    }

    /* renamed from: setReturnUrl */
    public void m41514x2484f3dd(java.lang.String str) {
        this.f20191xc8c3c21f = str;
    }

    /* renamed from: setSaveValue */
    public void m41515x663377b2(java.lang.String str) {
        this.f20192xa7245f4 = str;
    }

    /* renamed from: setSessionId */
    public void m41516x7ffb700f(java.lang.String str) {
        this.f20193x243a3e51 = str;
    }

    /* renamed from: setSessionType */
    public void m41517x6ee5052e(java.lang.String str) {
        this.f20194xfea94af0 = str;
    }

    /* renamed from: setShowListOtherNum */
    public void m41518xf427c933(boolean z17) {
        this.f20176x93447ae8.f20202x523b89fb = z17;
    }

    /* renamed from: setShowNum */
    public void m41519x2c76a487(boolean z17) {
        this.f20176x93447ae8.f20203x58a962bf = z17;
    }

    /* renamed from: setUnit */
    public void m41520x76510906(java.lang.String str) {
        this.f20176x93447ae8.f20205x36d984 = str;
    }

    /* renamed from: setWxAppId */
    public void m41521x18d22df9(java.lang.String str) {
        this.f20176x93447ae8.f20206x6793a4bb = str;
    }

    /* renamed from: setZoneId */
    public void m41522x2ecb48e9(java.lang.String str) {
        this.f20195xd67ef1e7 = str;
    }
}
