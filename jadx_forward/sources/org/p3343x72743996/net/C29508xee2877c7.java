package org.p3343x72743996.net;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder */
/* loaded from: classes16.dex */
public final class C29508xee2877c7 extends org.p3343x72743996.net.AbstractC29520xf01d5733 {

    /* renamed from: SUPPORTED_OPTIONS */
    private static final java.util.Set<java.lang.Integer> f73829x499d2fcd = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(1, 2, 3)));

    /* renamed from: mDelegate */
    private final org.p3343x72743996.net.AbstractC29520xf01d5733 f73830x55d38512;

    /* renamed from: mExperimentalOptionsPatches */
    private final java.util.List<org.p3343x72743996.net.C29508xee2877c7.ExperimentalOptionsPatch> f73831xb964efcd = new java.util.ArrayList();

    /* renamed from: mParsedExperimentalOptions */
    private org.json.JSONObject f73832x60e278d8;

    @java.lang.FunctionalInterface
    /* renamed from: org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder$ExperimentalOptionsPatch */
    /* loaded from: classes16.dex */
    public interface ExperimentalOptionsPatch {
        /* renamed from: applyTo */
        void mo153265xd0b86a89(org.json.JSONObject jSONObject);
    }

    public C29508xee2877c7(org.p3343x72743996.net.AbstractC29520xf01d5733 abstractC29520xf01d5733) {
        this.f73830x55d38512 = abstractC29520xf01d5733;
    }

    /* renamed from: createDefaultIfAbsent */
    private static org.json.JSONObject m153239x8f84bb7b(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            optJSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(str, optJSONObject);
            } catch (org.json.JSONException e17) {
                throw new java.lang.IllegalArgumentException("Failed adding a default object for key [" + str + "]", e17);
            }
        }
        return optJSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setConnectionMigrationOptions$2 */
    public static /* synthetic */ void m153240x320ceba1(org.p3343x72743996.net.C29497x80dc8a0e c29497x80dc8a0e, org.json.JSONObject jSONObject) {
        org.json.JSONObject m153239x8f84bb7b = m153239x8f84bb7b(jSONObject, "QUIC");
        if (c29497x80dc8a0e.m153125x6f81ce8() != null) {
            m153239x8f84bb7b.put("migrate_sessions_on_network_change_v2", c29497x80dc8a0e.m153125x6f81ce8());
        }
        if (c29497x80dc8a0e.m153124xc47655b8() != null) {
            m153239x8f84bb7b.put("allow_server_migration", c29497x80dc8a0e.m153124xc47655b8());
        }
        if (c29497x80dc8a0e.m153131xf70a46ac() != null) {
            m153239x8f84bb7b.put("migrate_idle_sessions", c29497x80dc8a0e.m153131xf70a46ac());
        }
        if (c29497x80dc8a0e.m153127x1c255d3a() != null) {
            m153239x8f84bb7b.put("idle_session_migration_period_seconds", c29497x80dc8a0e.m153127x1c255d3a());
        }
        if (c29497x80dc8a0e.m153132xa20e93e4() != null) {
            m153239x8f84bb7b.put("retry_on_alternate_network_before_handshake", c29497x80dc8a0e.m153132xa20e93e4());
        }
        if (c29497x80dc8a0e.m153129x78b247bf() != null) {
            m153239x8f84bb7b.put("max_time_on_non_default_network_seconds", c29497x80dc8a0e.m153129x78b247bf());
        }
        if (c29497x80dc8a0e.m153128x640f7672() != null) {
            m153239x8f84bb7b.put("max_migrations_to_non_default_network_on_path_degrading", c29497x80dc8a0e.m153128x640f7672());
        }
        if (c29497x80dc8a0e.m153130x7b546629() != null) {
            m153239x8f84bb7b.put("max_migrations_to_non_default_network_on_write_error", c29497x80dc8a0e.m153130x7b546629());
        }
        if (c29497x80dc8a0e.m153126xaf5939c6() != null) {
            boolean booleanValue = c29497x80dc8a0e.m153126xaf5939c6().booleanValue();
            boolean z17 = false;
            if (c29497x80dc8a0e.m153123xc7c0ee5a() != null) {
                boolean booleanValue2 = c29497x80dc8a0e.m153123xc7c0ee5a().booleanValue();
                if (!booleanValue && booleanValue2) {
                    throw new java.lang.IllegalArgumentException("Unable to turn on non-default network usage without path degradation migration!");
                }
                if (booleanValue && booleanValue2) {
                    z17 = true;
                    m153239x8f84bb7b.put("migrate_sessions_early_v2", true);
                } else {
                    m153239x8f84bb7b.put("migrate_sessions_early_v2", false);
                }
            }
            if (z17) {
                return;
            }
            m153239x8f84bb7b.put("allow_port_migration", booleanValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setDnsOptions$1 */
    public static /* synthetic */ void m153241x28b25b27(org.p3343x72743996.net.C29503x5bd00555 c29503x5bd00555, org.json.JSONObject jSONObject) {
        org.json.JSONObject m153239x8f84bb7b = m153239x8f84bb7b(jSONObject, "AsyncDNS");
        if (c29503x5bd00555.m153209xb0e2d43d() != null) {
            m153239x8f84bb7b.put("enable", c29503x5bd00555.m153209xb0e2d43d());
        }
        org.json.JSONObject m153239x8f84bb7b2 = m153239x8f84bb7b(jSONObject, "StaleDNS");
        if (c29503x5bd00555.m153204x51381a69() != null) {
            m153239x8f84bb7b2.put("enable", c29503x5bd00555.m153204x51381a69());
        }
        if (c29503x5bd00555.m153205x8bd8aebc() != null) {
            m153239x8f84bb7b2.put("persist_to_disk", c29503x5bd00555.m153205x8bd8aebc());
        }
        if (c29503x5bd00555.m153206xbaf1b043() != null) {
            m153239x8f84bb7b2.put("persist_delay_ms", c29503x5bd00555.m153206xbaf1b043());
        }
        if (c29503x5bd00555.m153208x5313af78() != null) {
            org.p3343x72743996.net.C29503x5bd00555.StaleDnsOptions m153208x5313af78 = c29503x5bd00555.m153208x5313af78();
            if (m153208x5313af78.m153220x2117db20() != null) {
                m153239x8f84bb7b2.put("allow_other_network", m153208x5313af78.m153220x2117db20());
            }
            if (m153208x5313af78.m153221x5c3b4915() != null) {
                m153239x8f84bb7b2.put("delay_ms", m153208x5313af78.m153221x5c3b4915());
            }
            if (m153208x5313af78.m153223xe4317199() != null) {
                m153239x8f84bb7b2.put("use_stale_on_name_not_resolved", m153208x5313af78.m153223xe4317199());
            }
            if (m153208x5313af78.m153222xfbb37c12() != null) {
                m153239x8f84bb7b2.put("max_expired_time_ms", m153208x5313af78.m153222xfbb37c12());
            }
        }
        org.json.JSONObject m153239x8f84bb7b3 = m153239x8f84bb7b(jSONObject, "QUIC");
        if (c29503x5bd00555.m153207xe0b2e0c2() != null) {
            m153239x8f84bb7b3.put("race_stale_dns_on_connection", c29503x5bd00555.m153207xe0b2e0c2());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setQuicOptions$0 */
    public static /* synthetic */ void m153242x4472d07(org.p3343x72743996.net.C29548xd6d24260 c29548xd6d24260, org.json.JSONObject jSONObject) {
        org.json.JSONObject m153239x8f84bb7b = m153239x8f84bb7b(jSONObject, "QUIC");
        if (!c29548xd6d24260.m153489xc62b384b().isEmpty()) {
            java.util.Set<java.lang.String> m153489xc62b384b = c29548xd6d24260.m153489xc62b384b();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator<T> it = m153489xc62b384b.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb6.append((java.lang.CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb6.append((java.lang.CharSequence) ",");
                    }
                }
            }
            m153239x8f84bb7b.put("host_whitelist", sb6.toString());
        }
        if (!c29548xd6d24260.m153480x9f65c9a4().isEmpty()) {
            java.util.Set<java.lang.String> m153480x9f65c9a4 = c29548xd6d24260.m153480x9f65c9a4();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.util.Iterator<T> it6 = m153480x9f65c9a4.iterator();
            if (it6.hasNext()) {
                while (true) {
                    sb7.append((java.lang.CharSequence) it6.next());
                    if (!it6.hasNext()) {
                        break;
                    } else {
                        sb7.append((java.lang.CharSequence) ",");
                    }
                }
            }
            m153239x8f84bb7b.put("quic_version", sb7.toString());
        }
        if (!c29548xd6d24260.m153476xbf0a512a().isEmpty()) {
            java.util.Set<java.lang.String> m153476xbf0a512a = c29548xd6d24260.m153476xbf0a512a();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            java.util.Iterator<T> it7 = m153476xbf0a512a.iterator();
            if (it7.hasNext()) {
                while (true) {
                    sb8.append((java.lang.CharSequence) it7.next());
                    if (!it7.hasNext()) {
                        break;
                    } else {
                        sb8.append((java.lang.CharSequence) ",");
                    }
                }
            }
            m153239x8f84bb7b.put("connection_options", sb8.toString());
        }
        if (!c29548xd6d24260.m153474x971a2d1f().isEmpty()) {
            java.util.Set<java.lang.String> m153474x971a2d1f = c29548xd6d24260.m153474x971a2d1f();
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            java.util.Iterator<T> it8 = m153474x971a2d1f.iterator();
            if (it8.hasNext()) {
                while (true) {
                    sb9.append((java.lang.CharSequence) it8.next());
                    if (!it8.hasNext()) {
                        break;
                    } else {
                        sb9.append((java.lang.CharSequence) ",");
                    }
                }
            }
            m153239x8f84bb7b.put("client_connection_options", sb9.toString());
        }
        if (!c29548xd6d24260.m153481x2a6854d2().isEmpty()) {
            java.util.Set<java.lang.String> m153481x2a6854d2 = c29548xd6d24260.m153481x2a6854d2();
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            java.util.Iterator<T> it9 = m153481x2a6854d2.iterator();
            if (it9.hasNext()) {
                while (true) {
                    sb10.append((java.lang.CharSequence) it9.next());
                    if (!it9.hasNext()) {
                        break;
                    } else {
                        sb10.append((java.lang.CharSequence) ",");
                    }
                }
            }
            m153239x8f84bb7b.put("set_quic_flags", sb10.toString());
        }
        if (c29548xd6d24260.m153485x71fdd4b1() != null) {
            m153239x8f84bb7b.put("max_server_configs_stored_in_properties", c29548xd6d24260.m153485x71fdd4b1());
        }
        if (c29548xd6d24260.m153483xf21e99b9() != null) {
            m153239x8f84bb7b.put("user_agent_id", c29548xd6d24260.m153483xf21e99b9());
        }
        if (c29548xd6d24260.m153491x88161635() != null) {
            m153239x8f84bb7b.put("retry_without_alt_svc_on_quic_errors", c29548xd6d24260.m153491x88161635());
        }
        if (c29548xd6d24260.m153479xcdee5a88() != null) {
            m153239x8f84bb7b.put("disable_tls_zero_rtt", !c29548xd6d24260.m153479xcdee5a88().booleanValue());
        }
        if (c29548xd6d24260.m153488xd15e0bbb() != null) {
            m153239x8f84bb7b.put("max_idle_time_before_crypto_handshake_seconds", c29548xd6d24260.m153488xd15e0bbb());
        }
        if (c29548xd6d24260.m153477x4ce407fe() != null) {
            m153239x8f84bb7b.put("max_time_before_crypto_handshake_seconds", c29548xd6d24260.m153477x4ce407fe());
        }
        if (c29548xd6d24260.m153484xc851f2c6() != null) {
            m153239x8f84bb7b.put("idle_connection_timeout_seconds", c29548xd6d24260.m153484xc851f2c6());
        }
        if (c29548xd6d24260.m153490xd246ba8e() != null) {
            m153239x8f84bb7b.put("retransmittable_on_wire_timeout_milliseconds", c29548xd6d24260.m153490xd246ba8e());
        }
        if (c29548xd6d24260.m153475xbe563715() != null) {
            m153239x8f84bb7b.put("close_sessions_on_ip_change", c29548xd6d24260.m153475xbe563715());
        }
        if (c29548xd6d24260.m153482x624d431f() != null) {
            m153239x8f84bb7b.put("goaway_sessions_on_ip_change", c29548xd6d24260.m153482x624d431f());
        }
        if (c29548xd6d24260.m153487xed5321ec() != null) {
            m153239x8f84bb7b.put("initial_delay_for_broken_alternative_service_seconds", c29548xd6d24260.m153487xed5321ec());
        }
        if (c29548xd6d24260.m153486x451d8be9() != null) {
            m153239x8f84bb7b.put("exponential_backoff_on_initial_delay", c29548xd6d24260.m153486x451d8be9());
        }
        if (c29548xd6d24260.m153478x7a4bec4() != null) {
            m153239x8f84bb7b.put("delay_main_job_with_available_spdy_session", c29548xd6d24260.m153478x7a4bec4());
        }
    }

    /* renamed from: parseExperimentalOptions */
    private static org.json.JSONObject m153243x3087bee3(java.lang.String str) {
        try {
            return new org.json.JSONObject(str);
        } catch (org.json.JSONException e17) {
            throw new java.lang.IllegalArgumentException("Experimental options parsing failed", e17);
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: addPublicKeyPins */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153244x1709deb3(java.lang.String str, java.util.Set<byte[]> set, boolean z17, java.util.Date date) {
        this.f73830x55d38512.mo153244x1709deb3(str, set, z17, date);
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: addQuicHint */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153245x864dd1a6(java.lang.String str, int i17, int i18) {
        this.f73830x55d38512.mo153245x864dd1a6(str, i17, i18);
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: build */
    public org.p3343x72743996.net.AbstractC29507xc7c0f987 mo153246x59bc66e() {
        if (this.f73832x60e278d8 == null && this.f73831xb964efcd.isEmpty()) {
            return this.f73830x55d38512.mo153246x59bc66e();
        }
        if (this.f73832x60e278d8 == null) {
            this.f73832x60e278d8 = new org.json.JSONObject();
        }
        java.util.Iterator<org.p3343x72743996.net.C29508xee2877c7.ExperimentalOptionsPatch> it = this.f73831xb964efcd.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo153265xd0b86a89(this.f73832x60e278d8);
            } catch (org.json.JSONException e17) {
                throw new java.lang.IllegalStateException("Unable to apply JSON patch!", e17);
            }
        }
        this.f73830x55d38512.mo153259x3bb208d4(this.f73832x60e278d8.toString());
        return this.f73830x55d38512.mo153246x59bc66e();
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: enableBrotli */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153247x7e503dd5(boolean z17) {
        this.f73830x55d38512.mo153247x7e503dd5(z17);
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: enableHttp2 */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153248xa991ece7(boolean z17) {
        this.f73830x55d38512.mo153248xa991ece7(z17);
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: enableHttpCache */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153249x84904997(int i17, long j17) {
        this.f73830x55d38512.mo153249x84904997(i17, j17);
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: enableNetworkQualityEstimator */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153250xedb7408c(boolean z17) {
        this.f73830x55d38512.mo153250xedb7408c(z17);
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: enablePublicKeyPinningBypassForLocalTrustAnchors */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153251xa4501926(boolean z17) {
        this.f73830x55d38512.mo153251xa4501926(z17);
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: enableQuic */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153252x70d74261(boolean z17) {
        this.f73830x55d38512.mo153252x70d74261(z17);
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: enableSdch */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153253x70d7ea99(boolean z17) {
        this.f73830x55d38512.mo153253x70d7ea99(z17);
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: getDefaultUserAgent */
    public java.lang.String mo153254x265d382f() {
        return this.f73830x55d38512.mo153254x265d382f();
    }

    /* renamed from: getDelegate */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 m153255xacb01afb() {
        return this.f73830x55d38512;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: getSupportedConfigOptions */
    public java.util.Set<java.lang.Integer> mo153256xbc9729e4() {
        return f73829x499d2fcd;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: setConnectionMigrationOptions */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153257xaf3aff0(final org.p3343x72743996.net.C29497x80dc8a0e c29497x80dc8a0e) {
        if (this.f73830x55d38512.mo153256xbc9729e4().contains(1)) {
            this.f73830x55d38512.mo153257xaf3aff0(c29497x80dc8a0e);
            return this;
        }
        this.f73831xb964efcd.add(new org.p3343x72743996.net.C29508xee2877c7.ExperimentalOptionsPatch() { // from class: org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder$$c
            @Override // org.p3343x72743996.net.C29508xee2877c7.ExperimentalOptionsPatch
            /* renamed from: applyTo */
            public final void mo153265xd0b86a89(org.json.JSONObject jSONObject) {
                org.p3343x72743996.net.C29508xee2877c7.m153240x320ceba1(org.p3343x72743996.net.C29497x80dc8a0e.this, jSONObject);
            }
        });
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: setDnsOptions */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153258x1632f37(final org.p3343x72743996.net.C29503x5bd00555 c29503x5bd00555) {
        if (this.f73830x55d38512.mo153256xbc9729e4().contains(2)) {
            this.f73830x55d38512.mo153258x1632f37(c29503x5bd00555);
            return this;
        }
        this.f73831xb964efcd.add(new org.p3343x72743996.net.C29508xee2877c7.ExperimentalOptionsPatch() { // from class: org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder$$a
            @Override // org.p3343x72743996.net.C29508xee2877c7.ExperimentalOptionsPatch
            /* renamed from: applyTo */
            public final void mo153265xd0b86a89(org.json.JSONObject jSONObject) {
                org.p3343x72743996.net.C29508xee2877c7.m153241x28b25b27(org.p3343x72743996.net.C29503x5bd00555.this, jSONObject);
            }
        });
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: setExperimentalOptions */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153259x3bb208d4(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            this.f73832x60e278d8 = null;
        } else {
            this.f73832x60e278d8 = m153243x3087bee3(str);
        }
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: setLibraryLoader */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153260xd89aab6c(org.p3343x72743996.net.AbstractC29500x62bc147f.Builder.LibraryLoader libraryLoader) {
        this.f73830x55d38512.mo153260xd89aab6c(libraryLoader);
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: setQuicOptions */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153261xe3a454be(final org.p3343x72743996.net.C29548xd6d24260 c29548xd6d24260) {
        if (this.f73830x55d38512.mo153256xbc9729e4().contains(3)) {
            this.f73830x55d38512.mo153261xe3a454be(c29548xd6d24260);
            return this;
        }
        this.f73831xb964efcd.add(new org.p3343x72743996.net.C29508xee2877c7.ExperimentalOptionsPatch() { // from class: org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder$$b
            @Override // org.p3343x72743996.net.C29508xee2877c7.ExperimentalOptionsPatch
            /* renamed from: applyTo */
            public final void mo153265xd0b86a89(org.json.JSONObject jSONObject) {
                org.p3343x72743996.net.C29508xee2877c7.m153242x4472d07(org.p3343x72743996.net.C29548xd6d24260.this, jSONObject);
            }
        });
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: setStoragePath */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153262x50e61f7e(java.lang.String str) {
        this.f73830x55d38512.mo153262x50e61f7e(str);
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: setThreadPriority */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153263x589076d0(int i17) {
        this.f73830x55d38512.mo153263x589076d0(i17);
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: setUserAgent */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153264x6e513fb8(java.lang.String str) {
        this.f73830x55d38512.mo153264x6e513fb8(str);
        return this;
    }
}
