package bw5;

/* loaded from: classes3.dex */
public enum k implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    AI_GEN_SUCCESS(0),
    AI_GEN_ERROR_UNKNOWN(1000),
    AI_GEN_ERROR_NETWORK(1001),
    AI_GEN_ERROR_INVALID_PARAM(1002),
    AI_GEN_ERROR_TIMEOUT(1003),
    AI_GEN_ERROR_SYSTEM(1004),
    AI_GEN_ERROR_FREQ_LIMIT(1005),
    AI_GEN_ERROR_BILL_CREATE_FAILED(2000),
    AI_GEN_ERROR_BILL_CONTEXT_NULL(2001),
    AI_GEN_ERROR_BILL_PARSE_FAILED(2002),
    AI_GEN_ERROR_BILL_CGI_REQUEST_FAILED(2003),
    AI_GEN_ERROR_BILL_CGI_RESPONSE_INVALID(2004),
    AI_GEN_ERROR_CHECKOUT_STRATEGY_NULL(2100),
    AI_GEN_ERROR_CHECKOUT_STRATEGY_SELECT_FAILED(2101),
    AI_GEN_ERROR_CHECKOUT_CANCELLED(2102),
    AI_GEN_ERROR_CHECKOUT_VERIFY_FAILED(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46375x82913de9),
    AI_GEN_ERROR_PAYMENT_WECOIN_CONSUME_FAILED(2200),
    AI_GEN_ERROR_PAYMENT_WECOIN_NO_MONEY(2201),
    AI_GEN_ERROR_PAYMENT_WECOIN_CANCELLED(2202),
    AI_GEN_ERROR_PAYMENT_WECOIN_INTERCEPT(2203),
    AI_GEN_ERROR_PAYMENT_FREE_QUOTA_EXHAUSTED(2210),
    AI_GEN_ERROR_MUSIC_INFO_GENERATE_FAILED(3000),
    AI_GEN_ERROR_MUSIC_INFO_NULL(3001),
    AI_GEN_ERROR_MUSIC_INFO_INVALID_INPUT(3002),
    AI_GEN_ERROR_COMPOSER_CREATE_FAILED(3100),
    AI_GEN_ERROR_COMPOSER_START_FAILED(3101),
    AI_GEN_ERROR_COMPOSER_GENERATION_FAILED(3102),
    AI_GEN_ERROR_COMPOSER_TIMEOUT(3103),
    AI_GEN_ERROR_COMPOSER_INVALID_STATUS(3104),
    AI_GEN_ERROR_POLLING_FAILED(3200),
    AI_GEN_ERROR_POLLING_MAX_RETRIES(3201),
    AI_GEN_ERROR_POLLING_INVALID_RESPONSE(3202),
    AI_GEN_ERROR_PAY_CGI_REQUEST_FAILED(4000),
    AI_GEN_ERROR_PAY_CGI_RESPONSE_INVALID(4001),
    AI_GEN_ERROR_PAY_CGI_SERVER_ERROR(4002),
    AI_GEN_ERROR_VERIFY_CGI_REQUEST_FAILED(4100),
    AI_GEN_ERROR_VERIFY_CGI_RESPONSE_INVALID(4101),
    AI_GEN_ERROR_VERIFY_CGI_SERVER_ERROR(4102),
    AI_GEN_ERROR_VERIFY_CGI_NO_LISTEN_ITEM(4103),
    AI_GEN_ERROR_CREATE_CGI_REQUEST_FAILED(4200),
    AI_GEN_ERROR_CREATE_CGI_RESPONSE_INVALID(4201),
    AI_GEN_ERROR_CREATE_CGI_SERVER_ERROR(4202);


    /* renamed from: d, reason: collision with root package name */
    public final int f110720d;

    k(int i17) {
        this.f110720d = i17;
    }

    public static bw5.k a(int i17) {
        if (i17 == 0) {
            return AI_GEN_SUCCESS;
        }
        if (i17 == 1000) {
            return AI_GEN_ERROR_UNKNOWN;
        }
        if (i17 == 1001) {
            return AI_GEN_ERROR_NETWORK;
        }
        if (i17 == 1002) {
            return AI_GEN_ERROR_INVALID_PARAM;
        }
        if (i17 == 1003) {
            return AI_GEN_ERROR_TIMEOUT;
        }
        if (i17 == 1004) {
            return AI_GEN_ERROR_SYSTEM;
        }
        if (i17 == 1005) {
            return AI_GEN_ERROR_FREQ_LIMIT;
        }
        if (i17 == 2210) {
            return AI_GEN_ERROR_PAYMENT_FREE_QUOTA_EXHAUSTED;
        }
        switch (i17) {
            case 2000:
                return AI_GEN_ERROR_BILL_CREATE_FAILED;
            case 2001:
                return AI_GEN_ERROR_BILL_CONTEXT_NULL;
            case 2002:
                return AI_GEN_ERROR_BILL_PARSE_FAILED;
            case 2003:
                return AI_GEN_ERROR_BILL_CGI_REQUEST_FAILED;
            case 2004:
                return AI_GEN_ERROR_BILL_CGI_RESPONSE_INVALID;
            default:
                switch (i17) {
                    case 2100:
                        return AI_GEN_ERROR_CHECKOUT_STRATEGY_NULL;
                    case 2101:
                        return AI_GEN_ERROR_CHECKOUT_STRATEGY_SELECT_FAILED;
                    case 2102:
                        return AI_GEN_ERROR_CHECKOUT_CANCELLED;
                    case com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46375x82913de9 /* 2103 */:
                        return AI_GEN_ERROR_CHECKOUT_VERIFY_FAILED;
                    default:
                        switch (i17) {
                            case 2200:
                                return AI_GEN_ERROR_PAYMENT_WECOIN_CONSUME_FAILED;
                            case 2201:
                                return AI_GEN_ERROR_PAYMENT_WECOIN_NO_MONEY;
                            case 2202:
                                return AI_GEN_ERROR_PAYMENT_WECOIN_CANCELLED;
                            case 2203:
                                return AI_GEN_ERROR_PAYMENT_WECOIN_INTERCEPT;
                            default:
                                switch (i17) {
                                    case 3000:
                                        return AI_GEN_ERROR_MUSIC_INFO_GENERATE_FAILED;
                                    case 3001:
                                        return AI_GEN_ERROR_MUSIC_INFO_NULL;
                                    case 3002:
                                        return AI_GEN_ERROR_MUSIC_INFO_INVALID_INPUT;
                                    default:
                                        switch (i17) {
                                            case 3100:
                                                return AI_GEN_ERROR_COMPOSER_CREATE_FAILED;
                                            case 3101:
                                                return AI_GEN_ERROR_COMPOSER_START_FAILED;
                                            case 3102:
                                                return AI_GEN_ERROR_COMPOSER_GENERATION_FAILED;
                                            case 3103:
                                                return AI_GEN_ERROR_COMPOSER_TIMEOUT;
                                            case 3104:
                                                return AI_GEN_ERROR_COMPOSER_INVALID_STATUS;
                                            default:
                                                switch (i17) {
                                                    case 3200:
                                                        return AI_GEN_ERROR_POLLING_FAILED;
                                                    case 3201:
                                                        return AI_GEN_ERROR_POLLING_MAX_RETRIES;
                                                    case 3202:
                                                        return AI_GEN_ERROR_POLLING_INVALID_RESPONSE;
                                                    default:
                                                        switch (i17) {
                                                            case 4000:
                                                                return AI_GEN_ERROR_PAY_CGI_REQUEST_FAILED;
                                                            case 4001:
                                                                return AI_GEN_ERROR_PAY_CGI_RESPONSE_INVALID;
                                                            case 4002:
                                                                return AI_GEN_ERROR_PAY_CGI_SERVER_ERROR;
                                                            default:
                                                                switch (i17) {
                                                                    case 4100:
                                                                        return AI_GEN_ERROR_VERIFY_CGI_REQUEST_FAILED;
                                                                    case 4101:
                                                                        return AI_GEN_ERROR_VERIFY_CGI_RESPONSE_INVALID;
                                                                    case 4102:
                                                                        return AI_GEN_ERROR_VERIFY_CGI_SERVER_ERROR;
                                                                    case 4103:
                                                                        return AI_GEN_ERROR_VERIFY_CGI_NO_LISTEN_ITEM;
                                                                    default:
                                                                        switch (i17) {
                                                                            case 4200:
                                                                                return AI_GEN_ERROR_CREATE_CGI_REQUEST_FAILED;
                                                                            case 4201:
                                                                                return AI_GEN_ERROR_CREATE_CGI_RESPONSE_INVALID;
                                                                            case 4202:
                                                                                return AI_GEN_ERROR_CREATE_CGI_SERVER_ERROR;
                                                                            default:
                                                                                return null;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f110720d;
    }
}
