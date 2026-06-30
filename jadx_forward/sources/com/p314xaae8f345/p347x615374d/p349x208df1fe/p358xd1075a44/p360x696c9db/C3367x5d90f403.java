package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db;

/* renamed from: com.tencent.kinda.framework.widget.tools.FlexBoxAttr */
/* loaded from: classes15.dex */
public class C3367x5d90f403 {
    public static final java.lang.String TAG = "MicroMsg.FlexBoxAttr";

    /* renamed from: UNDEFINED */
    public static final float f13331x68377130 = 1.0E21f;

    /* renamed from: alignContent */
    protected com.p314xaae8f345.p347x615374d.gen.EnumC3377x3c6a6e5 f13332xd32435b4;

    /* renamed from: alignItems */
    protected com.p314xaae8f345.p347x615374d.gen.EnumC3377x3c6a6e5 f13333xc09ffbbb;

    /* renamed from: alignSelf */
    protected com.p314xaae8f345.p347x615374d.gen.EnumC3377x3c6a6e5 f13334x6953cff1;

    /* renamed from: aspectRatio */
    protected float f13335x41194293;

    /* renamed from: bottom */
    protected float f13336xad8d9a2b;

    /* renamed from: bottomPercent */
    protected float f13337x8c64ab9a;

    /* renamed from: flexBasis */
    protected float f13338x95adf7c5;

    /* renamed from: flexDirection */
    protected com.p314xaae8f345.p347x615374d.gen.EnumC3398xf57f3f66 f13339xc5e00f86;

    /* renamed from: flexGrow */
    protected float f13340x67ef5bac;

    /* renamed from: flexShrink */
    protected float f13341x3d759362;

    /* renamed from: flexWrap */
    protected com.p314xaae8f345.p347x615374d.gen.EnumC3640x29446a f13342x67f69fe3;

    /* renamed from: heightPercent */
    protected float f13344xd241211e;

    /* renamed from: iFlexBoxChange */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange f13345xe3d3a379;

    /* renamed from: justifyContent */
    protected com.p314xaae8f345.p347x615374d.gen.EnumC3419x18bf0270 f13346x6ee75fc9;

    /* renamed from: left */
    protected float f13347x32a007;

    /* renamed from: leftPercent */
    protected float f13348x9182963e;

    /* renamed from: marginBottom */
    protected float f13349xeec39179;

    /* renamed from: marginBottomPercent */
    protected float f13350x5e76808c;

    /* renamed from: marginLeft */
    protected float f13351x757a12d5;

    /* renamed from: marginLeftPercent */
    protected float f13352xcb88ffb0;

    /* renamed from: marginRight */
    protected float f13353x3a1ea90e;

    /* renamed from: marginRightPercent */
    protected float f13354x57d2a757;

    /* renamed from: marginTop */
    protected float f13355xc1b9bcc7;

    /* renamed from: marginTopPercent */
    protected float f13356xe3e5a17e;

    /* renamed from: maxHeight */
    protected float f13357xc9fe87ab;

    /* renamed from: maxWidth */
    protected float f13358x17dd56c2;

    /* renamed from: minHeight */
    protected float f13359xf8099e19;

    /* renamed from: minWidth */
    protected float f13360xadfeba94;

    /* renamed from: paddingBottom */
    protected float f13361xc0fb19c;

    /* renamed from: paddingBottomPercent */
    protected float f13362x4d0f8309;

    /* renamed from: paddingLeft */
    protected float f13363xa685dfb8;

    /* renamed from: paddingLeftPercent */
    protected float f13364xf48a7d6d;

    /* renamed from: paddingRight */
    protected float f13365x2a8c788b;

    /* renamed from: paddingRightPercent */
    protected float f13366x4f00e13a;

    /* renamed from: paddingTop */
    protected float f13367x55f4784;

    /* renamed from: paddingTopPercent */
    protected float f13368x400ef821;

    /* renamed from: positionType */
    protected com.p314xaae8f345.p347x615374d.gen.EnumC3592xbd33423 f13369x207e003;

    /* renamed from: right */
    protected float f13370x677c21c;

    /* renamed from: rightPercent */
    protected float f13371x510be289;

    /* renamed from: testId */
    protected java.lang.String f13372xcbb7714d;
    protected float top;

    /* renamed from: topPercent */
    protected float f13373xa8380130;

    /* renamed from: visibility */
    protected int f13374x73b66312;

    /* renamed from: widthPercent */
    protected float f13376xaf4ee39f;

    /* renamed from: yogaNode */
    com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 f13377xbe811892 = com.p166x1da19ac6.p169x38ae70.AbstractC1577x5fb5fff8.m17025xaf65a0fc();

    /* renamed from: width */
    protected float f13375x6be2dc6 = 1.0E21f;

    /* renamed from: height */
    protected float f13343xb7389127 = 1.0E21f;

    /* renamed from: com.tencent.kinda.framework.widget.tools.FlexBoxAttr$IFlexBoxChange */
    /* loaded from: classes15.dex */
    public interface IFlexBoxChange {
        /* renamed from: onChange */
        void mo27161x3dcbea6f();
    }

    public C3367x5d90f403() {
        m27206xc394d7c();
    }

    /* renamed from: applyNodeDefaultParam */
    private void m27206xc394d7c() {
        com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 m17025xaf65a0fc = com.p166x1da19ac6.p169x38ae70.AbstractC1577x5fb5fff8.m17025xaf65a0fc();
        this.f13377xbe811892 = m17025xaf65a0fc;
        m17025xaf65a0fc.mo16980x6761d4f();
    }

    /* renamed from: isUndefined */
    public static boolean m27207x85ca346(float f17) {
        return java.lang.Float.compare(f17, 1.0E9f) >= 0 || java.lang.Float.compare(f17, -1.0E9f) <= 0;
    }

    /* renamed from: autoHeight */
    public void m27208xd5941bb6() {
        m27255x33ae02().mo16998x7531fd78();
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: autoWidth */
    public void m27209x628f9557() {
        m27255x33ae02().mo17021x58a65e53();
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: getAlignContent */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3377x3c6a6e5 m27210x3416c82a() {
        return this.f13332xd32435b4;
    }

    /* renamed from: getAlignItems */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3377x3c6a6e5 m27211xaee0b3b1() {
        return this.f13333xc09ffbbb;
    }

    /* renamed from: getAlignSelf */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3377x3c6a6e5 m27212x68c1413b() {
        return this.f13334x6953cff1;
    }

    /* renamed from: getAspectRatio */
    public float m27213x1aef895d() {
        return this.f13335x41194293;
    }

    /* renamed from: getBottom */
    public float m27214x12a4bd21() {
        return this.f13336xad8d9a2b;
    }

    /* renamed from: getBottomPercent */
    public float m27215x49c467e4() {
        return this.f13337x8c64ab9a;
    }

    /* renamed from: getFlexBasis */
    public float m27216x951b690f() {
        return this.f13338x95adf7c5;
    }

    /* renamed from: getFlexDirection */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3398xf57f3f66 m27217x833fcbd0() {
        return this.f13339xc5e00f86;
    }

    /* renamed from: getFlexGrow */
    public float m27218xe3c99922() {
        return this.f13340x67ef5bac;
    }

    /* renamed from: getFlexShrink */
    public float m27219x2bb64b58() {
        return this.f13341x3d759362;
    }

    /* renamed from: getFlexWrap */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3640x29446a m27220xe3d0dd59() {
        return this.f13342x67f69fe3;
    }

    /* renamed from: getHeight */
    public float m27221x1c4fb41d() {
        return m27207x85ca346(this.f13343xb7389127) ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27359xc5e1a28f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), this.f13377xbe811892.mo16951xbdc88367()) : this.f13343xb7389127;
    }

    /* renamed from: getHeightPercent */
    public float m27222x8fa0dd68() {
        return this.f13344xd241211e;
    }

    /* renamed from: getJustifyContent */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3419x18bf0270 m27223x5d7f2cbf() {
        return this.f13346x6ee75fc9;
    }

    /* renamed from: getLeft */
    public float m27224xfb82087d() {
        return this.f13347x32a007;
    }

    /* renamed from: getLeftPercent */
    public float m27225x6b58dd08() {
        return this.f13348x9182963e;
    }

    /* renamed from: getMarginBottom */
    public float m27226x4fb623ef() {
        return this.f13349xeec39179;
    }

    /* renamed from: getMarginBottomPercent */
    public float m27227xb6a65d56() {
        return this.f13350x5e76808c;
    }

    /* renamed from: getMarginLeft */
    public float m27228x63bacacb() {
        return this.f13351x757a12d5;
    }

    /* renamed from: getMarginLeftPercent */
    public float m27229x1ebd86fa() {
        return this.f13352xcb88ffb0;
    }

    /* renamed from: getMarginRight */
    public float m27230x13f4efd8() {
        return this.f13353x3a1ea90e;
    }

    /* renamed from: getMarginRightPercent */
    public float m27231x6b2f094d() {
        return this.f13354x57d2a757;
    }

    /* renamed from: getMarginTop */
    public float m27232xc1272e11() {
        return this.f13355xc1b9bcc7;
    }

    /* renamed from: getMarginTopPercent */
    public float m27233x8bbe08f4() {
        return this.f13356xe3e5a17e;
    }

    /* renamed from: getMaxHeight */
    public float m27234xc96bf8f5() {
        return this.f13357xc9fe87ab;
    }

    /* renamed from: getMaxWidth */
    public float m27235x93b79438() {
        return this.f13358x17dd56c2;
    }

    /* renamed from: getMinHeight */
    public float m27236xf7770f63() {
        return this.f13359xf8099e19;
    }

    /* renamed from: getMinWidth */
    public float m27237x29d8f80a() {
        return this.f13360xadfeba94;
    }

    /* renamed from: getPaddingBottom */
    public float m27238xc96f6de6() {
        return this.f13361xc0fb19c;
    }

    /* renamed from: getPaddingBottomPercent */
    public float m27239xfadb3f7f() {
        return this.f13362x4d0f8309;
    }

    /* renamed from: getPaddingLeft */
    public float m27240x805c2682() {
        return this.f13363xa685dfb8;
    }

    /* renamed from: getPaddingLeftPercent */
    public float m27241x7e6df63() {
        return this.f13364xf48a7d6d;
    }

    /* renamed from: getPaddingRight */
    public float m27242x8b7f0b01() {
        return this.f13365x2a8c788b;
    }

    /* renamed from: getPaddingRightPercent */
    public float m27243xa730be04() {
        return this.f13366x4f00e13a;
    }

    /* renamed from: getPaddingTop */
    public float m27244xf39fff7a() {
        return this.f13367x55f4784;
    }

    /* renamed from: getPaddingTopPercent */
    public float m27245x93437f6b() {
        return this.f13368x400ef821;
    }

    /* renamed from: getPositionType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3592xbd33423 m27246x62fa7279() {
        return this.f13369x207e003;
    }

    /* renamed from: getRight */
    public float m27247x75156866() {
        return this.f13370x677c21c;
    }

    /* renamed from: getRightPercent */
    public float m27248xb1fe74ff() {
        return this.f13371x510be289;
    }

    /* renamed from: getTestId */
    public java.lang.String m27249x30ce9443() {
        return this.f13372xcbb7714d;
    }

    /* renamed from: getTop */
    public float m27250xb588721f() {
        return this.top;
    }

    /* renamed from: getTopPercent */
    public float m27251x9678b926() {
        return this.f13373xa8380130;
    }

    /* renamed from: getVisibility */
    public int m27252x61f71b08() {
        return this.f13374x73b66312;
    }

    /* renamed from: getWidth */
    public float m27253x755bd410() {
        return m27207x85ca346(this.f13375x6be2dc6) ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27359xc5e1a28f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), this.f13377xbe811892.mo16954x5146f386()) : this.f13375x6be2dc6;
    }

    /* renamed from: getWidthPercent */
    public float m27254x10417615() {
        return this.f13376xaf4ee39f;
    }

    /* renamed from: node */
    public com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 m27255x33ae02() {
        return this.f13377xbe811892;
    }

    /* renamed from: setAlignContent */
    public void m27256x6a5fc336(com.p314xaae8f345.p347x615374d.gen.EnumC3377x3c6a6e5 enumC3377x3c6a6e5) {
        this.f13332xd32435b4 = enumC3377x3c6a6e5;
        m27255x33ae02().mo16981x6a5fc336(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3361xc77d7b4d.m27165x84b02fbb(enumC3377x3c6a6e5));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setAlignItems */
    public void m27257xdd0501bd(com.p314xaae8f345.p347x615374d.gen.EnumC3377x3c6a6e5 enumC3377x3c6a6e5) {
        this.f13333xc09ffbbb = enumC3377x3c6a6e5;
        m27255x33ae02().mo16982xdd0501bd(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3361xc77d7b4d.m27165x84b02fbb(enumC3377x3c6a6e5));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setAlignSelf */
    public void m27258xc51501af(com.p314xaae8f345.p347x615374d.gen.EnumC3377x3c6a6e5 enumC3377x3c6a6e5) {
        this.f13334x6953cff1 = enumC3377x3c6a6e5;
        m27255x33ae02().mo16983xc51501af(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3361xc77d7b4d.m27165x84b02fbb(enumC3377x3c6a6e5));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setAspectRatio */
    public void m27259xb154fcd1(float f17) {
        this.f13335x41194293 = f17;
        if (f17 > 0.0f) {
            m27255x33ae02().mo16984xb154fcd1(this.f13335x41194293);
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setBottom */
    public void m27260x5d9f12d(float f17) {
        this.f13336xad8d9a2b = f17;
        m27255x33ae02().mo17017xa32537ab(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.BOTTOM, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setBottomPercent */
    public void m27261xdc9ace58(float f17) {
        this.f13337x8c64ab9a = f17;
        m27255x33ae02().mo17018x7808de1a(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.BOTTOM, f17);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setFlexBasis */
    public void m27262xf16f2983(float f17) {
        this.f13338x95adf7c5 = f17;
        if (f17 > 0.0f) {
            m27255x33ae02().mo17020x53e9ee84(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setFlexDirection */
    public void m27263x16163244(com.p314xaae8f345.p347x615374d.gen.EnumC3398xf57f3f66 enumC3398xf57f3f66) {
        this.f13339xc5e00f86 = enumC3398xf57f3f66;
        m27255x33ae02().mo16994x16163244(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3361xc77d7b4d.m27162xddc62f8a(enumC3398xf57f3f66));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setFlexGrow */
    public void m27264xde81fa2e(float f17) {
        this.f13340x67ef5bac = f17;
        if (f17 >= 0.0f) {
            m27255x33ae02().mo16995xde81fa2e(this.f13340x67ef5bac);
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setFlexShrink */
    public void m27265x59da9964(float f17) {
        this.f13341x3d759362 = f17;
        if (f17 >= 0.0f) {
            m27255x33ae02().mo16996x59da9964(this.f13341x3d759362);
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setFlexWrap */
    public void m27266xde893e65(com.p314xaae8f345.p347x615374d.gen.EnumC3640x29446a enumC3640x29446a) {
        this.f13342x67f69fe3 = enumC3640x29446a;
        m27255x33ae02().mo17023x7651ffcc(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3361xc77d7b4d.m27166x3e2048d4(enumC3640x29446a));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setHeight */
    public void m27267xf84e829(float f17) {
        this.f13343xb7389127 = f17;
        if (f17 > 0.0f) {
            m27255x33ae02().mo16997xf84e829(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setHeightPercent */
    public void m27268x227743dc(float f17) {
        this.f13344xd241211e = f17;
        if (f17 > 0.0f) {
            m27255x33ae02().mo16999x227743dc(f17);
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setJustifyContent */
    public void m27269x257594cb(com.p314xaae8f345.p347x615374d.gen.EnumC3419x18bf0270 enumC3419x18bf0270) {
        this.f13346x6ee75fc9 = enumC3419x18bf0270;
        m27255x33ae02().mo17001x257594cb(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3361xc77d7b4d.m27163x53c54045(enumC3419x18bf0270));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setLeft */
    public void m27270x764ccf89(float f17) {
        this.f13347x32a007 = f17;
        m27255x33ae02().mo17017xa32537ab(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.LEFT, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setLeftPercent */
    public void m27271x1be507c(float f17) {
        this.f13348x9182963e = f17;
        m27255x33ae02().mo17018x7808de1a(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.LEFT, f17);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setMarginBottom */
    public void m27272x85ff1efb(float f17) {
        this.f13349xeec39179 = f17;
        m27255x33ae02().mo17002x17d8dcb0(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.BOTTOM, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setMarginBottomPercent */
    public void m27273x4eb1cca(float f17) {
        this.f13350x5e76808c = f17;
        m27255x33ae02().mo17004xd477975(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.BOTTOM, f17);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setMarginLeft */
    public void m27274x91df18d7(float f17) {
        this.f13351x757a12d5 = f17;
        m27255x33ae02().mo17002x17d8dcb0(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.LEFT, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setMarginLeftPercent */
    public void m27275xfa53936e(float f17) {
        this.f13352xcb88ffb0 = f17;
        m27255x33ae02().mo17004xd477975(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.LEFT, f17);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setMarginRight */
    public void m27276xaa5a634c(float f17) {
        this.f13353x3a1ea90e = f17;
        m27255x33ae02().mo17002x17d8dcb0(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.RIGHT, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setMarginRightPercent */
    public void m27277x25a8b59(float f17) {
        this.f13354x57d2a757 = f17;
        m27255x33ae02().mo17004xd477975(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.RIGHT, f17);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setMarginTop */
    public void m27278x1d7aee85(float f17) {
        this.f13355xc1b9bcc7 = f17;
        m27255x33ae02().mo17002x17d8dcb0(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.TOP, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setMarginTopPercent */
    public void m27279x2fba9e00(float f17) {
        this.f13356xe3e5a17e = f17;
        m27255x33ae02().mo17004xd477975(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.TOP, f17);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setMaxHeight */
    public void m27280x25bfb969(float f17) {
        this.f13357xc9fe87ab = f17;
        if (f17 > 0.0f) {
            m27255x33ae02().mo17005x25bfb969(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setMaxWidth */
    public void m27281x8e6ff544(float f17) {
        this.f13358x17dd56c2 = f17;
        if (f17 > 0.0f) {
            m27255x33ae02().mo17007x8e6ff544(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setMinHeight */
    public void m27282x53cacfd7(float f17) {
        this.f13359xf8099e19 = f17;
        if (f17 > 0.0f) {
            m27255x33ae02().mo17010x53cacfd7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setMinWidth */
    public void m27283x24915916(float f17) {
        this.f13360xadfeba94 = f17;
        if (f17 > 0.0f) {
            m27255x33ae02().mo17012x24915916(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setPaddingBottom */
    public void m27284x5c45d45a(float f17) {
        this.f13361xc0fb19c = f17;
        if (f17 >= 0.0f) {
            m27255x33ae02().mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.BOTTOM, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setPaddingBottomPercent */
    public void m27285x752e6e8b(float f17) {
        this.f13362x4d0f8309 = f17;
        if (this.f13361xc0fb19c > 0.0f) {
            m27255x33ae02().mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.BOTTOM, f17);
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setPaddingLeft */
    public void m27286x16c199f6(float f17) {
        this.f13363xa685dfb8 = f17;
        if (f17 >= 0.0f) {
            m27255x33ae02().mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.LEFT, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setPaddingLeftPercent */
    public void m27287x9f12616f(float f17) {
        this.f13364xf48a7d6d = f17;
        if (this.f13363xa685dfb8 > 0.0f) {
            m27255x33ae02().mo17016xffd76ff6(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.LEFT, f17);
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setPaddingRight */
    public void m27288xc1c8060d(float f17) {
        this.f13365x2a8c788b = f17;
        if (f17 >= 0.0f) {
            m27255x33ae02().mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.RIGHT, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setPaddingRightPercent */
    public void m27289xf5757d78(float f17) {
        this.f13366x4f00e13a = f17;
        if (this.f13365x2a8c788b > 0.0f) {
            m27255x33ae02().mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.RIGHT, f17);
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setPaddingTop */
    public void m27290x21c44d86(float f17) {
        this.f13367x55f4784 = f17;
        if (f17 >= 0.0f) {
            m27255x33ae02().mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.TOP, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setPaddingTopPercent */
    public void m27291x6ed98bdf(float f17) {
        this.f13368x400ef821 = f17;
        if (this.f13367x55f4784 > 0.0f) {
            m27255x33ae02().mo17016xffd76ff6(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.TOP, f17);
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setPositionType */
    public void m27292x99436d85(com.p314xaae8f345.p347x615374d.gen.EnumC3592xbd33423 enumC3592xbd33423) {
        this.f13369x207e003 = enumC3592xbd33423;
        m27255x33ae02().mo17019x99436d85(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3361xc77d7b4d.m27164x3c9baf7f(enumC3592xbd33423));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setRight */
    public void m27293x53a382da(float f17) {
        this.f13370x677c21c = f17;
        m27255x33ae02().mo17017xa32537ab(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.RIGHT, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setRightPercent */
    public void m27294xe847700b(float f17) {
        this.f13371x510be289 = f17;
        m27255x33ae02().mo17018x7808de1a(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.RIGHT, f17);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setTestId */
    public void m27295x2403c84f(java.lang.String str) {
        this.f13372xcbb7714d = str;
    }

    /* renamed from: setTop */
    public void m27296xca029993(float f17) {
        this.top = f17;
        m27255x33ae02().mo17017xa32537ab(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.TOP, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setTopPercent */
    public void m27297xc49d0732(float f17) {
        this.f13373xa8380130 = f17;
        m27255x33ae02().mo17018x7808de1a(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.TOP, f17);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.mo27161x3dcbea6f();
        }
    }

    /* renamed from: setVisibility */
    public void m27298x901b6914(int i17) {
        this.f13374x73b66312 = i17;
    }

    /* renamed from: setWidth */
    public void m27299x53e9ee84(float f17) {
        this.f13375x6be2dc6 = f17;
        if (f17 > 0.0f) {
            m27255x33ae02().mo17020x53e9ee84(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), f17));
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setWidthPercent */
    public void m27300x468a7121(float f17) {
        this.f13376xaf4ee39f = f17;
        if (f17 > 0.0f) {
            m27255x33ae02().mo17022x468a7121(f17);
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange = this.f13345xe3d3a379;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.mo27161x3dcbea6f();
            }
        }
    }

    /* renamed from: setYogaNode */
    public void m27301x3513b714(com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 abstractC1575xc25b7cb2) {
        this.f13377xbe811892 = abstractC1575xc25b7cb2;
    }

    public C3367x5d90f403(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3367x5d90f403.IFlexBoxChange iFlexBoxChange) {
        this.f13345xe3d3a379 = iFlexBoxChange;
        m27206xc394d7c();
    }
}
