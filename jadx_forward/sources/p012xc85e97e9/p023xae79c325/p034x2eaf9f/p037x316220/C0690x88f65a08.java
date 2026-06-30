package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.CaptureConfig */
/* loaded from: classes14.dex */
public final class C0690x88f65a08 {

    /* renamed from: CAPTURE_CONFIG_ID_TAG_KEY */
    public static final java.lang.String f1600x52cbcd1a = "CAPTURE_CONFIG_ID_KEY";

    /* renamed from: DEFAULT_ID */
    public static final int f1601x455dcbf9 = -1;

    /* renamed from: TEMPLATE_TYPE_NONE */
    public static final int f1605xde313398 = -1;

    /* renamed from: mCameraCaptureCallbacks */
    final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> f1606xd57b1a3a;

    /* renamed from: mCameraCaptureResult */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be f1607x8069ee31;

    /* renamed from: mImplementationOptions */
    final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 f1608x72260c1f;

    /* renamed from: mPostviewEnabled */
    final boolean f1609x4faf880f;

    /* renamed from: mSurfaces */
    final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> f1610xc4b150f3;

    /* renamed from: mTagBundle */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c f1611xc5f18acf;

    /* renamed from: mTemplateType */
    final int f1612x5d691be1;

    /* renamed from: mUseRepeatingSurface */
    private final boolean f1613xb2defc40;

    /* renamed from: OPTION_ROTATION */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1604x5742e808 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.captureConfig.rotation", java.lang.Integer.TYPE);

    /* renamed from: OPTION_JPEG_QUALITY */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1602x542c7792 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.captureConfig.jpegQuality", java.lang.Integer.class);

    /* renamed from: OPTION_RESOLVED_FRAME_RATE */
    private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<android.util.Range<java.lang.Integer>> f1603xd94a506f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.captureConfig.resolvedFrameRate", android.util.Range.class);

    /* renamed from: androidx.camera.core.impl.CaptureConfig$OptionUnpacker */
    /* loaded from: classes14.dex */
    public interface OptionUnpacker {
        /* renamed from: unpack */
        void mo3201xcde97c32(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder builder);
    }

    public C0690x88f65a08(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62, int i17, boolean z17, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> list2, boolean z18, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
        this.f1610xc4b150f3 = list;
        this.f1608x72260c1f = interfaceC0692x78a46f62;
        this.f1612x5d691be1 = i17;
        this.f1606xd57b1a3a = java.util.Collections.unmodifiableList(list2);
        this.f1613xb2defc40 = z18;
        this.f1611xc5f18acf = c0760xc2ac609c;
        this.f1607x8069ee31 = interfaceC0663xe081a7be;
        this.f1609x4faf880f = z17;
    }

    /* renamed from: defaultEmptyCaptureConfig */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 m5328x48fa7dfc() {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder().m5350x59bc66e();
    }

    /* renamed from: getCameraCaptureCallbacks */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> m5329x78e2a463() {
        return this.f1606xd57b1a3a;
    }

    /* renamed from: getCameraCaptureResult */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be m5330xedfdbca8() {
        return this.f1607x8069ee31;
    }

    /* renamed from: getExpectedFrameRateRange */
    public android.util.Range<java.lang.Integer> m5331xb632311e() {
        android.util.Range<java.lang.Integer> range = (android.util.Range) this.f1608x72260c1f.mo5380x77ba97d1(f1603xd94a506f, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.f1796xf5f0b888);
        java.util.Objects.requireNonNull(range);
        return range;
    }

    /* renamed from: getId */
    public int m5332x5db1b11() {
        java.lang.Object m5703xb5887064 = this.f1611xc5f18acf.m5703xb5887064(f1600x52cbcd1a);
        if (m5703xb5887064 == null) {
            return -1;
        }
        return ((java.lang.Integer) m5703xb5887064).intValue();
    }

    /* renamed from: getImplementationOptions */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 m5333xca0018d6() {
        return this.f1608x72260c1f;
    }

    /* renamed from: getPreviewStabilizationMode */
    public int m5334x732bab0() {
        java.lang.Integer num = (java.lang.Integer) this.f1608x72260c1f.mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1833xf56d3424, 0);
        java.util.Objects.requireNonNull(num);
        return num.intValue();
    }

    /* renamed from: getSurfaces */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> m5335x1b8de6dc() {
        return java.util.Collections.unmodifiableList(this.f1610xc4b150f3);
    }

    /* renamed from: getTagBundle */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c m5336x4aa7b206() {
        return this.f1611xc5f18acf;
    }

    /* renamed from: getTemplateType */
    public int m5337x26c6954a() {
        return this.f1612x5d691be1;
    }

    /* renamed from: getVideoStabilizationMode */
    public int m5338x96948bdd() {
        java.lang.Integer num = (java.lang.Integer) this.f1608x72260c1f.mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1837x7f07e711, 0);
        java.util.Objects.requireNonNull(num);
        return num.intValue();
    }

    /* renamed from: isPostviewEnabled */
    public boolean m5339xaec6c9b2() {
        return this.f1609x4faf880f;
    }

    /* renamed from: isUseRepeatingSurface */
    public boolean m5340x4b66b463() {
        return this.f1613xb2defc40;
    }

    /* renamed from: androidx.camera.core.impl.CaptureConfig$Builder */
    /* loaded from: classes14.dex */
    public static final class Builder {

        /* renamed from: mCameraCaptureCallbacks */
        private java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> f1614xd57b1a3a;

        /* renamed from: mCameraCaptureResult */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be f1615x8069ee31;

        /* renamed from: mImplementationOptions */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8 f1616x72260c1f;

        /* renamed from: mMutableTagBundle */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0733x886ed856 f1617xe0c25ec3;

        /* renamed from: mPostviewEnabled */
        private boolean f1618x4faf880f;

        /* renamed from: mSurfaces */
        private final java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> f1619xc4b150f3;

        /* renamed from: mTemplateType */
        private int f1620x5d691be1;

        /* renamed from: mUseRepeatingSurface */
        private boolean f1621xb2defc40;

        public Builder() {
            this.f1619xc4b150f3 = new java.util.HashSet();
            this.f1616x72260c1f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5524xaf65a0fc();
            this.f1620x5d691be1 = -1;
            this.f1618x4faf880f = false;
            this.f1614xd57b1a3a = new java.util.ArrayList();
            this.f1621xb2defc40 = false;
            this.f1617xe0c25ec3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0733x886ed856.m5530xaf65a0fc();
        }

        /* renamed from: createFrom */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder m5341x51964ec6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.OptionUnpacker m5743xb9981f24 = interfaceC0768x83509b59.m5743xb9981f24(null);
            if (m5743xb9981f24 != null) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder builder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder();
                m5743xb9981f24.mo3201xcde97c32(interfaceC0768x83509b59, builder);
                return builder;
            }
            throw new java.lang.IllegalStateException("Implementation is missing option unpacker for " + interfaceC0768x83509b59.m6139xb3ee7b2(interfaceC0768x83509b59.toString()));
        }

        /* renamed from: from */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder m5342x3017aa(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder(c0690x88f65a08);
        }

        /* renamed from: addAllCameraCaptureCallbacks */
        public void m5343xc7f822cd(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> collection) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it = collection.iterator();
            while (it.hasNext()) {
                m5345xd4aa81a5(it.next());
            }
        }

        /* renamed from: addAllTags */
        public void m5344x3b5ec179(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c) {
            this.f1617xe0c25ec3.m5532x43020d1b(c0760xc2ac609c);
        }

        /* renamed from: addCameraCaptureCallback */
        public void m5345xd4aa81a5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6) {
            if (this.f1614xd57b1a3a.contains(abstractC0659xd0769ba6)) {
                return;
            }
            this.f1614xd57b1a3a.add(abstractC0659xd0769ba6);
        }

        /* renamed from: addImplementationOption */
        public <T> void m5346xcffb2508(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<T> option, T t17) {
            this.f1616x72260c1f.mo5521x25e7888e(option, t17);
        }

        /* renamed from: addImplementationOptions */
        public void m5347x2f697c6b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option : interfaceC0692x78a46f62.mo5378xc8202020()) {
                java.lang.Object mo5380x77ba97d1 = this.f1616x72260c1f.mo5380x77ba97d1(option, null);
                java.lang.Object mo5379x77ba97d1 = interfaceC0692x78a46f62.mo5379x77ba97d1(option);
                if (mo5380x77ba97d1 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0729x433a916a) {
                    ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0729x433a916a) mo5380x77ba97d1).m5516xab35b940(((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0729x433a916a) mo5379x77ba97d1).m5519xe5d39815());
                } else {
                    if (mo5379x77ba97d1 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0729x433a916a) {
                        mo5379x77ba97d1 = ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0729x433a916a) mo5379x77ba97d1).m5518x5a5dd5d();
                    }
                    this.f1616x72260c1f.mo5520x25e7888e(option, interfaceC0692x78a46f62.mo5376x2503ee2f(option), mo5379x77ba97d1);
                }
            }
        }

        /* renamed from: addSurface */
        public void m5348x34744cc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
            this.f1619xc4b150f3.add(abstractC0697x654a0293);
        }

        /* renamed from: addTag */
        public void m5349xab35ff39(java.lang.String str, java.lang.Object obj) {
            this.f1617xe0c25ec3.m5533xc5c5860b(str, obj);
        }

        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 m5350x59bc66e() {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08(new java.util.ArrayList(this.f1619xc4b150f3), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0.m5538x3017aa(this.f1616x72260c1f), this.f1620x5d691be1, this.f1618x4faf880f, new java.util.ArrayList(this.f1614xd57b1a3a), this.f1621xb2defc40, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c.m5702x3017aa(this.f1617xe0c25ec3), this.f1615x8069ee31);
        }

        /* renamed from: clearSurfaces */
        public void m5351x73b326d3() {
            this.f1619xc4b150f3.clear();
        }

        /* renamed from: getExpectedFrameRateRange */
        public android.util.Range<java.lang.Integer> m5352xb632311e() {
            return (android.util.Range) this.f1616x72260c1f.mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.f1603xd94a506f, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.f1796xf5f0b888);
        }

        /* renamed from: getImplementationOptions */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 m5353xca0018d6() {
            return this.f1616x72260c1f;
        }

        /* renamed from: getSurfaces */
        public java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> m5354x1b8de6dc() {
            return this.f1619xc4b150f3;
        }

        /* renamed from: getTag */
        public java.lang.Object m5355xb5887064(java.lang.String str) {
            return this.f1617xe0c25ec3.m5703xb5887064(str);
        }

        /* renamed from: getTemplateType */
        public int m5356x26c6954a() {
            return this.f1620x5d691be1;
        }

        /* renamed from: isUseRepeatingSurface */
        public boolean m5357x4b66b463() {
            return this.f1621xb2defc40;
        }

        /* renamed from: removeCameraCaptureCallback */
        public boolean m5358xe42adda2(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6) {
            return this.f1614xd57b1a3a.remove(abstractC0659xd0769ba6);
        }

        /* renamed from: removeSurface */
        public void m5359xd8cbaf89(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
            this.f1619xc4b150f3.remove(abstractC0697x654a0293);
        }

        /* renamed from: setCameraCaptureResult */
        public void m5360x3c427c1c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
            this.f1615x8069ee31 = interfaceC0663xe081a7be;
        }

        /* renamed from: setExpectedFrameRateRange */
        public void m5361xe875cd2a(android.util.Range<java.lang.Integer> range) {
            m5346xcffb2508(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.f1603xd94a506f, range);
        }

        /* renamed from: setId */
        public void m5362x684351d(int i17) {
            this.f1617xe0c25ec3.m5533xc5c5860b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.f1600x52cbcd1a, java.lang.Integer.valueOf(i17));
        }

        /* renamed from: setImplementationOptions */
        public void m5363x9a12cb4a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
            this.f1616x72260c1f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5525x3017aa(interfaceC0692x78a46f62);
        }

        /* renamed from: setPostviewEnabled */
        public void m5364x9b39c37a(boolean z17) {
            this.f1618x4faf880f = z17;
        }

        /* renamed from: setPreviewStabilization */
        public void m5365xb21eba79(int i17) {
            if (i17 != 0) {
                m5346xcffb2508(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1833xf56d3424, java.lang.Integer.valueOf(i17));
            }
        }

        /* renamed from: setTemplateType */
        public void m5366x5d0f9056(int i17) {
            this.f1620x5d691be1 = i17;
        }

        /* renamed from: setUseRepeatingSurface */
        public void m5367x6eb78a2b(boolean z17) {
            this.f1621xb2defc40 = z17;
        }

        /* renamed from: setVideoStabilization */
        public void m5368xc6227d26(int i17) {
            if (i17 != 0) {
                m5346xcffb2508(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1837x7f07e711, java.lang.Integer.valueOf(i17));
            }
        }

        private Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08) {
            java.util.HashSet hashSet = new java.util.HashSet();
            this.f1619xc4b150f3 = hashSet;
            this.f1616x72260c1f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5524xaf65a0fc();
            this.f1620x5d691be1 = -1;
            this.f1618x4faf880f = false;
            this.f1614xd57b1a3a = new java.util.ArrayList();
            this.f1621xb2defc40 = false;
            this.f1617xe0c25ec3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0733x886ed856.m5530xaf65a0fc();
            hashSet.addAll(c0690x88f65a08.f1610xc4b150f3);
            this.f1616x72260c1f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5525x3017aa(c0690x88f65a08.f1608x72260c1f);
            this.f1620x5d691be1 = c0690x88f65a08.f1612x5d691be1;
            this.f1614xd57b1a3a.addAll(c0690x88f65a08.m5329x78e2a463());
            this.f1621xb2defc40 = c0690x88f65a08.m5340x4b66b463();
            this.f1617xe0c25ec3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0733x886ed856.m5531x3017aa(c0690x88f65a08.m5336x4aa7b206());
            this.f1618x4faf880f = c0690x88f65a08.f1609x4faf880f;
        }
    }
}
